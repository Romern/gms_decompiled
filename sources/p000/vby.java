package p000;

import android.content.SyncResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vby {

    /* renamed from: a */
    public static final sbw f48984a = new sbw("SyncManager", "");

    /* renamed from: b */
    public final vpu f48985b;

    /* renamed from: c */
    public final uhn f48986c;

    /* renamed from: d */
    public final vkv f48987d;

    /* renamed from: e */
    public final vco f48988e;

    /* renamed from: f */
    public final vbd f48989f;

    /* renamed from: g */
    public final vcz f48990g;

    /* renamed from: h */
    public final Map f48991h;

    /* renamed from: i */
    public final Map f48992i;

    /* renamed from: j */
    public final long f48993j = ((Long) twy.f46839aW.mo58455c()).longValue();

    /* renamed from: k */
    public final long f48994k = ((Long) twy.f46840aX.mo58455c()).longValue();

    /* renamed from: l */
    public final long f48995l = ((Long) twy.f46838aV.mo58455c()).longValue();

    /* renamed from: m */
    public final int f48996m = ((Integer) twy.f46837aU.mo58455c()).intValue();

    public vby(vpu vpu) {
        vco vco = new vco(vpu);
        this.f48985b = vpu;
        this.f48986c = vpu.f49757d;
        this.f48987d = vpu.f49762i;
        sdo.m34959a(vco);
        this.f48988e = vco;
        this.f48990g = vpu.f49777x;
        this.f48989f = vpu.f49778y;
        this.f48991h = new HashMap();
        this.f48992i = new HashMap();
    }

    /* renamed from: a */
    public final long mo28214a(SyncResult syncResult, vcn vcn, uih uih, vks vks) {
        vbi vbi = new vbi(this.f48985b, uih, vcn.mo28165b());
        vcn.mo28163a(vbi, vks, syncResult);
        long a = vbi.mo28196a(syncResult, vcn.mo28164a());
        vcn.mo28162a(syncResult);
        return a;
    }
}
