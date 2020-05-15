package p000;

import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: phi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phi extends qal {

    /* renamed from: a */
    final /* synthetic */ phj f39106a;

    /* renamed from: b */
    private final String f39107b;

    /* renamed from: h */
    private final List f39108h;

    /* renamed from: i */
    private List f39109i = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public phi(phj phj, String str, List list, List list2) {
        super(phj.f39139m.getApplicationContext(), str, phj.f39110a, phj.f39115d, phj.f39120i);
        this.f39106a = phj;
        this.f39107b = str;
        ArrayList arrayList = new ArrayList(list);
        this.f39108h = arrayList;
        arrayList.add("");
        if (list2 != null) {
            this.f39109i = new ArrayList(list2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo23073a() {
        List arrayList = new ArrayList();
        if (qay.m31790c(this.f39106a.f39139m)) {
            arrayList = ((WifiManager) this.f39106a.f39139m.getSystemService("wifi")).getScanResults();
        }
        bltw a = qay.m31778a(arrayList, this.f39109i);
        if (a == null) {
            return null;
        }
        if (a.f127755a.size() == 0 && a.f127756b.size() == 0) {
            return null;
        }
        bxvd da = blug.f127799d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blug blug = (blug) da.f164949b;
        a.getClass();
        blug.f127802b = a;
        blug.f127801a |= 1;
        bxvd da2 = bltx.f127757c.mo74144da();
        String str = this.f39107b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bltx bltx = (bltx) da2.f164949b;
        str.getClass();
        bltx.f127759a |= 1;
        bltx.f127760b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blug blug2 = (blug) da.f164949b;
        bltx bltx2 = (bltx) da2.mo74062i();
        bltx2.getClass();
        blug2.f127803c = bltx2;
        blug2.f127801a |= 2;
        return da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23074a(int i) {
        this.f40798d.mo23675c("Failed to start audio for type %s, error=%d", this.f39107b, Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23075a(byte[] bArr) {
        try {
            bluh bluh = (bluh) bxvk.m124016a(bluh.f127804d, bArr, bxus.m123744c());
            this.f40798d.mo23673b("Successfully requested the %s for nearby devices", this.f39107b);
            this.f40798d.mo23673b("success count=%d, offline count=%d, error count=%d", Integer.valueOf(bluh.f127806a), Integer.valueOf(bluh.f127807b), Integer.valueOf(bluh.f127808c));
        } catch (bxwf e) {
            this.f40798d.mo23675c("Unable to parse SendMessageResponse data", new Object[0]);
        }
    }
}
