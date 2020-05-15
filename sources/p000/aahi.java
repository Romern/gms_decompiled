package p000;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: aahi */
final /* synthetic */ class aahi implements bmxj {

    /* renamed from: a */
    private final aahj f28130a;

    /* renamed from: b */
    private final long f28131b;

    /* renamed from: c */
    private final String f28132c;

    /* renamed from: d */
    private final dcg f28133d;

    public aahi(aahj aahj, long j, String str, dcg dcg) {
        this.f28130a = aahj;
        this.f28131b = j;
        this.f28132c = str;
        this.f28133d = dcg;
    }

    public final Object apply(Object obj) {
        String str;
        int a;
        String str2 = "";
        aahj aahj = this.f28130a;
        long j = this.f28131b;
        String str3 = this.f28132c;
        dcg dcg = this.f28133d;
        String str4 = (String) obj;
        if (TextUtils.isEmpty(str4)) {
            aahj.f28136c.mo16858a(4004, System.currentTimeMillis() - j);
        }
        bxvd da = vvt.f50051p.mo74144da();
        if (!TextUtils.isEmpty(str3)) {
            da.mo74037c(bxtx.m123261a(spn.m35861a(str3)));
        }
        if (!(dcg == dcg.UNSUPPORTED || (a = vvs.m41469a(dcg.f12804f)) == 0)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            vvt vvt = (vvt) da.f164949b;
            vvt.f50067o = a;
            vvt.f50053a |= 4096;
        }
        byte[] decode = Base64.decode(str4, 8);
        bxvd da2 = vvz.f50100d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        vvz vvz = (vvz) da2.f164949b;
        "msa-l".getClass();
        vvz.f50102a |= 1;
        vvz.f50103b = "msa-l";
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vvt vvt2 = (vvt) da.f164949b;
        vvz vvz2 = (vvz) da2.mo74062i();
        vvz2.getClass();
        vvt2.f50054b = vvz2;
        vvt2.f50053a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vvt.m41470a((vvt) da.f164949b);
        try {
            str = System.getProperty("os.arch");
        } catch (IllegalStateException e) {
            str = str2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vvt vvt3 = (vvt) da.f164949b;
        str.getClass();
        vvt3.f50053a |= 2;
        vvt3.f50056d = str;
        bxtx a2 = bxtx.m123261a(decode);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vvt vvt4 = (vvt) da.f164949b;
        a2.getClass();
        vvt4.f50053a |= 128;
        vvt4.f50062j = a2;
        da.mo74017a(aahj.m21258a("BOARD", Build.BOARD));
        da.mo74017a(aahj.m21258a("BOOTLOADER", Build.BOOTLOADER));
        da.mo74017a(aahj.m21258a("BRAND", Build.BRAND));
        da.mo74017a(aahj.m21258a("CPU_ABI", Build.CPU_ABI));
        da.mo74017a(aahj.m21258a("CPU_ABI2", Build.CPU_ABI2));
        try {
            str2 = TextUtils.join(",", (String[]) Build.class.getField("SUPPORTED_ABIS").get(null));
        } catch (Exception e2) {
        }
        da.mo74017a(aahj.m21258a("SUPPORTED_ABIS", str2));
        da.mo74017a(aahj.m21258a("DEVICE", Build.DEVICE));
        da.mo74017a(aahj.m21258a("DISPLAY", Build.DISPLAY));
        da.mo74017a(aahj.m21258a("FINGERPRINT", Build.FINGERPRINT));
        da.mo74017a(aahj.m21258a("HARDWARE", Build.HARDWARE));
        da.mo74017a(aahj.m21258a("HOST", Build.HOST));
        da.mo74017a(aahj.m21258a("ID", Build.ID));
        da.mo74017a(aahj.m21258a("MANUFACTURER", Build.MANUFACTURER));
        da.mo74017a(aahj.m21258a("MODEL", Build.MODEL));
        da.mo74017a(aahj.m21258a("PRODUCT", Build.PRODUCT));
        da.mo74017a(aahj.m21258a("RADIO", Build.RADIO));
        da.mo74017a(aahj.m21258a("TAGS", Build.TAGS));
        da.mo74017a(aahj.m21258a("TIME", Long.toString(Build.TIME)));
        da.mo74017a(aahj.m21258a("TYPE", Build.TYPE));
        da.mo74017a(aahj.m21258a("USER", Build.USER));
        da.mo74017a(aahj.m21258a("VERSION.CODENAME", Build.VERSION.CODENAME));
        da.mo74017a(aahj.m21258a("VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL));
        da.mo74017a(aahj.m21258a("VERSION.RELEASE", Build.VERSION.RELEASE));
        da.mo74017a(aahj.m21258a("VERSION.SDK", Build.VERSION.SDK));
        da.mo74017a(aahj.m21258a("VERSION.SDK_INT", Integer.toString(Build.VERSION.SDK_INT)));
        bxvd da3 = vwb.f50109c.mo74144da();
        vvt vvt5 = (vvt) da.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        vwb vwb = (vwb) da3.f164949b;
        vvt5.getClass();
        vwb.f50112b = vvt5;
        vwb.f50111a |= 1;
        return ((vwb) da3.mo74062i()).mo73642k();
    }
}
