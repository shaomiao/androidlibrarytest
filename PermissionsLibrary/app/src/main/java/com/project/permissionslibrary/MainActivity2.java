package com.project.permissionslibrary;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;
//@RuntimePermissions
public class MainActivity2 extends AppCompatActivity {

//    private final String permissionStr = Manifest.permission.CALL_PHONE;
//    /**
//     * @RuntimePermissions 注释此活动或碎片
//     * @NeedsPermission 注释请求的权限后面跟着权限获取后执行的方法@NeedsPermission(Manifest.permission.CALL_PHONE)
//     * @OnShowRationale 一般用于展示用户点击取消后向用户说明原因，在positiveButton上一般帮一个监听器执行request.proceed()方法，在取消按钮上帮一个监听器执行request.cancel()方法
//     * @OnPermissionDenied ：用户拒绝后执行的方法
//     * @OnNeverAskAgain ：用户点击不再询问后执行的方法
//     *  MainActivityPermissionsDispatcher.showXXXXWithCheck(MainActivity2.this);
//        此方法用于在适当时候获取权限，具体内容可以在生成的辅助类MainActivityPermissionsDispatcher中间查看
//
//        7.最后要调用辅助类处理放回的结果
//     */
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MainActivityPermissionsDispatcher.showToastWithCheck(MainActivity2.this);
//            }
//        });
//    }
//
////    @Override
////    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
////        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
////    }
//
//    @NeedsPermission(permissionStr) // 在需要获取权限的地方注释
//    void showToast() {
//        Toast.makeText(this, "获得存储权限", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        MainActivityPermissionsDispatcher.onRequestPermissionsResult(MainActivity2.this,requestCode,grantResults);
//    }
//
//    @OnShowRationale(permissionStr) // 提示用户为什么需要此权限
//    void showWhy(final PermissionRequest request) {
//        new AlertDialog.Builder(this)
//                .setMessage("权限测试")
//                .setPositiveButton("知道了", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        request.proceed(); // 再次执行请求
//                    }
//                }).show();
//    }
//    @OnPermissionDenied(permissionStr) // 一旦用户拒绝了
//    void denied() {
//        Toast.makeText(this, "真的不给权限吗", Toast.LENGTH_SHORT).show();
//
//    }
//    @OnNeverAskAgain(permissionStr) //用户选择不再询问
//    void notAsk() {
//        Toast.makeText(this, "好的不问了", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
//
//        Uri uri = Uri.fromParts("package", getPackageName(), null);
//
//        intent.setData(uri);
//
//        startActivityForResult(intent, 1);
//    }


}
