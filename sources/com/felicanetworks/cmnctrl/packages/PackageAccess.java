package com.felicanetworks.cmnctrl.packages;

import android.content.pm.PackageInfo;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageAccess implements FunctionCodeInterface {
    protected AppContext context;

    public PackageAccess(AppContext appContext) {
        this.context = appContext;
    }

    public VersionInformationData getAppVersionInfo() {
        try {
            PackageInfo packageInfo = this.context.androidContext.getPackageManager().getPackageInfo(this.context.androidContext.getPackageName(), 0);
            return new VersionInformationData(packageInfo.versionCode, packageInfo.versionName);
        } catch (Exception e) {
            throw new PackageAccessException(e, this.context.logMgr.out(LogMgr.CatExp.ERR, this, e), 1);
        }
    }

    public int getClassCode() {
        return 1;
    }

    public int getFunctionCode() {
        return 2;
    }
}
