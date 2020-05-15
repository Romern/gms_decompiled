package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Arrays;

/* renamed from: bckh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bckh {

    /* renamed from: a */
    public final Context f104371a;

    /* renamed from: b */
    final BroadcastReceiver f104372b;

    /* renamed from: c */
    public final chqp f104373c;

    public bckh(Context context) {
        String str = (String) bbqt.m88417a(context).f103105a.mo58455c();
        int intValue = ((Integer) bbqt.m88417a(context).f103158b.mo58455c()).intValue();
        ((Boolean) bbqt.m88417a(context).f103115aJ.mo58455c()).booleanValue();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("tachyonHostName = ");
        sb.append(str);
        sb.append(" and tachyonPortNumber = ");
        sb.append(intValue);
        bbos.m88291b("StubFactory", sb.toString());
        cifv b = cifv.m150191b(str, intValue);
        bcjs.m89169a(b);
        int i = Build.VERSION.SDK_INT;
        bbos.m88289a("OkHttpChannelBuilder", "Using Spatula header keyless authentication.");
        b.f189398e.addAll(Arrays.asList(new bbqb(context)));
        this.f104373c = b.mo85581b();
        this.f104371a = context;
        bckg bckg = new bckg(this);
        this.f104372b = bckg;
        context.registerReceiver(bckg, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    public final bqgg mo56959a() {
        return bqga.m112775a(new bcjn((cbjd) ciih.m150373a(new cbjc(), this.f104373c)));
    }

    /* renamed from: b */
    public final bqgg mo56960b() {
        return bqga.m112775a(new bcjn((cbja) ciih.m150373a(new cbiz(), this.f104373c)));
    }

    /* renamed from: c */
    public final bqgg mo56961c() {
        return bqga.m112775a(new bcjn((cbcg) ciih.m150373a(new cbcf(), this.f104373c)));
    }

    /* renamed from: d */
    public final bqgg mo56962d() {
        return bqga.m112775a(new bcjn((cbet) ciih.m150373a(new cbes(), this.f104373c)));
    }

    /* renamed from: e */
    public final bqgg mo56963e() {
        return bqga.m112775a(new bcjn((cbcp) ciih.m150373a(new cbco(), this.f104373c)));
    }
}
