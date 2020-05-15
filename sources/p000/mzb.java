package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.security.SecureRandom;

/* renamed from: mzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mzb {

    /* renamed from: a */
    public static final lvn f35000a = new lvn("FullBackupSession");

    /* renamed from: b */
    public final Context f35001b;

    /* renamed from: c */
    public final mbx f35002c;

    /* renamed from: d */
    public final nds f35003d;

    /* renamed from: e */
    public final mzf f35004e;

    /* renamed from: f */
    public final myy f35005f;

    /* renamed from: g */
    public final mym f35006g;

    /* renamed from: h */
    public final myz f35007h;

    /* renamed from: i */
    public final myx f35008i;

    /* renamed from: j */
    public final nad f35009j;

    /* renamed from: k */
    public final myt f35010k;

    /* renamed from: l */
    public final ParcelFileDescriptor f35011l;

    /* renamed from: m */
    public final PackageInfo f35012m;

    /* renamed from: n */
    public final String f35013n;

    /* renamed from: o */
    public final long f35014o;

    /* renamed from: p */
    public long f35015p;

    /* renamed from: q */
    private final mys f35016q = new mza(this);

    public mzb(Context context, mbx mbx, nds nds, mzf mzf, myy myy, mym mym, myz myz, myx myx, nad nad, ParcelFileDescriptor parcelFileDescriptor, PackageInfo packageInfo, myt myt) {
        this.f35001b = context;
        this.f35002c = mbx;
        this.f35003d = nds;
        this.f35004e = mzf;
        this.f35005f = myy;
        this.f35006g = mym;
        this.f35007h = myz;
        this.f35008i = myx;
        this.f35009j = nad;
        this.f35011l = parcelFileDescriptor;
        this.f35012m = packageInfo;
        this.f35014o = ccnf.m130741j() * 1048576;
        this.f35013n = packageInfo.packageName;
        this.f35010k = myt;
        myt.mo20334a(this.f35016q);
    }

    /* renamed from: a */
    public static myt m25803a(Context context, lwj lwj, lwc lwc, String str, bzsy bzsy, nds nds, myo myo, mbx mbx) {
        if (lwb.m24518a(context).mo19689a()) {
            f35000a.mo25414c("Using encrypted processor for %s", str);
            return new nch(context, snp.m35704b(10), lwj, new SecureRandom(), new lxd(context, lwc, myo.mo20314a(), lwj, mbx).mo19720a(), str, mbx);
        }
        f35000a.mo25414c("Using unencrypted processor for %s", str);
        return new myw(context, myu.f34969a, str, new lvx(bzsy), nds);
    }

    /* renamed from: a */
    public final void mo20344a() {
        myx myx = this.f35008i;
        String str = this.f35013n;
        SharedPreferences.Editor edit = myx.f34994d.edit();
        sqv sqv = myx.f34992b;
        edit.putLong(str, System.currentTimeMillis() + myx.f34993c).apply();
        int i = Build.VERSION.SDK_INT;
    }
}
