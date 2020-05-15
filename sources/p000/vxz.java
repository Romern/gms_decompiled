package p000;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: vxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxz {

    /* renamed from: a */
    public final bxvd f50215a;

    public vxz(String str) {
        String str2;
        String str3 = "";
        bxvd da = vvt.f50051p.mo74144da();
        this.f50215a = da;
        bxvd da2 = vvz.f50100d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        vvz vvz = (vvz) da2.f164949b;
        str.getClass();
        vvz.f50102a |= 1;
        vvz.f50103b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vvt vvt = (vvt) da.f164949b;
        vvz vvz2 = (vvz) da2.mo74062i();
        vvz2.getClass();
        vvt.f50054b = vvz2;
        vvt.f50053a |= 1;
        bxvd bxvd = this.f50215a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        vvt.m41470a((vvt) bxvd.f164949b);
        bxvd bxvd2 = this.f50215a;
        try {
            str2 = System.getProperty("os.arch");
        } catch (Exception e) {
            str2 = str3;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        vvt vvt2 = (vvt) bxvd2.f164949b;
        str2.getClass();
        vvt2.f50053a |= 2;
        vvt2.f50056d = str2;
        bxvd bxvd3 = this.f50215a;
        bxvd3.mo74017a(m41569a("BOARD", Build.BOARD));
        bxvd3.mo74017a(m41569a("BOOTLOADER", Build.BOOTLOADER));
        bxvd3.mo74017a(m41569a("BRAND", Build.BRAND));
        bxvd3.mo74017a(m41569a("CPU_ABI", Build.CPU_ABI));
        bxvd3.mo74017a(m41569a("CPU_ABI2", Build.CPU_ABI2));
        try {
            str3 = TextUtils.join(",", (String[]) Build.class.getField("SUPPORTED_ABIS").get(null));
        } catch (Exception e2) {
        }
        bxvd3.mo74017a(m41569a("SUPPORTED_ABIS", str3));
        bxvd3.mo74017a(m41569a("DEVICE", Build.DEVICE));
        bxvd3.mo74017a(m41569a("DISPLAY", Build.DISPLAY));
        bxvd3.mo74017a(m41569a("FINGERPRINT", Build.FINGERPRINT));
        bxvd3.mo74017a(m41569a("HARDWARE", Build.HARDWARE));
        bxvd3.mo74017a(m41569a("HOST", Build.HOST));
        bxvd3.mo74017a(m41569a("ID", Build.ID));
        bxvd3.mo74017a(m41569a("MANUFACTURER", Build.MANUFACTURER));
        bxvd3.mo74017a(m41569a("MODEL", Build.MODEL));
        bxvd3.mo74017a(m41569a("PRODUCT", Build.PRODUCT));
        bxvd3.mo74017a(m41569a("RADIO", Build.RADIO));
        bxvd3.mo74017a(m41569a("SERIAL", spn.m35894h()));
        bxvd3.mo74017a(m41569a("TAGS", Build.TAGS));
        bxvd3.mo74017a(m41569a("TIME", Long.toString(Build.TIME)));
        bxvd3.mo74017a(m41569a("TYPE", Build.TYPE));
        bxvd3.mo74017a(m41569a("USER", Build.USER));
        bxvd3.mo74017a(m41569a("VERSION.CODENAME", Build.VERSION.CODENAME));
        bxvd3.mo74017a(m41569a("VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL));
        bxvd3.mo74017a(m41569a("VERSION.RELEASE", Build.VERSION.RELEASE));
        bxvd3.mo74017a(m41569a("VERSION.SDK", Build.VERSION.SDK));
        bxvd3.mo74017a(m41569a("VERSION.SDK_INT", Integer.toString(Build.VERSION.SDK_INT)));
    }

    /* renamed from: a */
    private static final vvv m41569a(String str, String str2) {
        bxvd da = vvv.f50074d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vvv vvv = (vvv) da.f164949b;
        str.getClass();
        int i = vvv.f50076a | 1;
        vvv.f50076a = i;
        vvv.f50077b = str;
        str2.getClass();
        vvv.f50076a = i | 2;
        vvv.f50078c = str2;
        return (vvv) da.mo74062i();
    }

    /* renamed from: a */
    public final vvt mo28945a() {
        return (vvt) this.f50215a.mo74062i();
    }

    /* renamed from: a */
    public final void mo28946a(vyz vyz) {
        bxvd bxvd = this.f50215a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        vvt vvt = vvt.f50051p;
        ((vvt) bxvd.f164949b).f50061i = bxvk.m124030de();
        vyv vyv = vyz.f50264c;
        ArrayList arrayList = new ArrayList();
        String[] list = vyv.m41616b(vyv.f50255a).list();
        for (String str : list) {
            if (vyv.mo28980a(str).mo28984b()) {
                arrayList.add(new vyy(str));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f50215a.mo74037c(bxtx.m123261a(spn.m35861a(((vyy) arrayList.get(i)).f50261a)));
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
