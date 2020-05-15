package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* renamed from: awno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awno extends sbm {

    /* renamed from: a */
    public final Context f94663a;

    /* renamed from: b */
    public final int f94664b;

    /* renamed from: c */
    public final String f94665c;

    /* renamed from: d */
    public final int f94666d;

    /* renamed from: e */
    public final boolean f94667e;

    /* renamed from: a */
    public static Bundle m80361a(int i, String str, String str2, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return awao.f94138f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    public awno(Context context, Looper looper, sat sat, rjz rjz, rka rka, int i, int i2, boolean z) {
        super(context, looper, 4, sat, rjz, rka);
        this.f94663a = context;
        this.f94664b = i;
        this.f94665c = sat.mo25318a();
        this.f94666d = i2;
        this.f94667e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof awnf) {
            return (awnf) queryLocalInterface;
        }
        return new awnd(iBinder);
    }
}
