package wang.day11;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.text.AlteredCharSequence;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

import java.nio.charset.MalformedInputException;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private TextView textView = null;
    private static final int item1 = Menu.FIRST;
    private static final int item2 = Menu.FIRST+1;
    private static final int item3 = Menu.FIRST+2;
    private Button button = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.buttom);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("AlertDialog的实例");
                builder.setMessage("真的要推迟吗");
                builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("否", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                });
                AlertDialog ad = builder.create();
                ad.show();
            }
//        textView = (TextView)findViewById(R.id.view);
//        registerForContextMenu(textView);
});
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu file = menu.addSubMenu("文件");
        SubMenu edit = menu.addSubMenu("编辑");
        file.add(0,item1,0,"新建");
        file.add(0,item2,1,"打开");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case item1:
                break;
            case item2:
                break;
        }
        return true;
    }

//        @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        menu.add(0,item1,0,"红色背景");
//        menu.add(0,item2,0,"绿色背景");
//        menu.add(0,item3,0,"蓝色背景");
//        getMenuInflater().inflate(R.menu.test,menu);
//
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        switch (id){
//            case R.id.red:
//                textView.setTextColor(Color.YELLOW);
//                textView.setBackgroundColor(Color.RED);
//                break;
//            case R.id.green:
//                textView.setTextColor(Color.RED);
//                textView.setBackgroundColor(Color.GREEN);
//                break;
//            case R.id.blue:
//                textView.setTextColor(Color.WHITE);
//                textView.setBackgroundColor(Color.BLUE);
//                break;
//
//        }
//        int itemid = item.getItemId();
//        switch (itemid){
//            case item1:
//                textView.setTextColor(Color.YELLOW);
//                textView.setBackgroundColor(Color.RED);
//                break;
//            case item2:
//                textView.setTextColor(Color.RED);
//                textView.setBackgroundColor(Color.GREEN);
//                break;
//            case item3:
//                textView.setTextColor(Color.WHITE);
//                textView.setBackgroundColor(Color.BLUE);
//                break;
//        }
//        return true;
//
//            Resources res = this.getResources();
//        String[] s = res.getStringArray(R.array.colors);
//        for(int i = 0;i < s.length; i++){
//            Log.e("TEST", s[i]);
//        }
//        Resources r = this.getResources();
//        int[] ints = r.getIntArray(R.array.number);
//        for (int j = 0; j < ints.length; j++) {
//            Log.e("TEST",String.valueOf(ints[j]));
//        }
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add(0,0,0,"开始");
//        menu.getItem(0).setIcon(R.drawable.ic_launcher);
//        menu.add(0,1,1,"结束");
//        getMenuInflater().inflate(R.menu.test,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int itemid = item.getItemId();
//        switch (itemid){
//            case 0:
//                break;
//            case 1:
//                finish();;
//                break;
//        }
//        int id = item.getItemId();
//        switch (id){
//            case R.id.start:
//                break;
//            case R.id.end:
//                finish();;
//                break;
//        }
//        return true;
//    }
//
//        public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.files,menu);
//        return true;
//    }
//
//    private void exitDialog(String msg){
//        AlertDialog.Builder builder  = new AlertDialog.Builder(this);
//        builder.setMessage(msg);
//        builder.setCancelable(false);
//        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int which) {
//                finish();
//            }
//        });
//        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int which) {
//                return;
//            }
//        });
//        AlertDialog alert = builder.create();
//        alert.show();
//    }
//    private void aboutDialog(String msg){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(msg);
//        builder.setCancelable(false);
//        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int which) {
//
//            }
//        });
//        AlertDialog alert = builder.create();
//        alert.show();
//    }
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        switch(id){
//            case R.id.about_group:
//                aboutDialog("本例演示使用XML定义菜单");
//                break;
//            case R.id.exit_group:
//                exitDialog("真的要退出吗？");
//                break;
//        }
//        return true;
//    }



}