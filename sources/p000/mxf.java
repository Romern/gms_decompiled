package p000;

import android.os.Parcel;
import com.google.android.libraries.photos.backup.api.AutoBackupState;

/* renamed from: mxf */
final /* synthetic */ class mxf implements mxj {

    /* renamed from: a */
    static final mxj f34884a = new mxf();

    private mxf() {
    }

    /* renamed from: a */
    public final Object mo20292a(beaz beaz) {
        Parcel a = beaz.mo8526a(1, beaz.mo8529bj());
        AutoBackupState autoBackupState = (AutoBackupState) dcl.m8163a(a, AutoBackupState.CREATOR);
        a.recycle();
        return autoBackupState;
    }
}
