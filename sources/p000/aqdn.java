package p000;

import android.os.Bundle;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: aqdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdn extends apyi {
    public aqdn(SafetyNetClientChimeraService safetyNetClientChimeraService, aaag aaag, String str) {
        super(safetyNetClientChimeraService, aaag, str);
    }

    /* renamed from: b */
    private final void m71392b() {
        new soc(1, 9).execute(new aqdm(this));
    }

    /* renamed from: a */
    public final void mo47175a() {
        mo47696a(new aqcb(null, null, this.f85139a, null, 0, null, 4));
    }

    /* renamed from: c */
    public final void mo47187c(apga apga) {
        mo47696a(new aqcb(apga, this.f85139a));
    }

    /* renamed from: d */
    public final void mo47188d(apga apga) {
        mo47696a(new apub(this.f85140b, apga));
        m71392b();
    }

    /* renamed from: e */
    public final void mo47189e(apga apga) {
        apyj apyj = this.f85140b;
        mo47696a(new apub(apyj, apga, apua.m71005a(apyj)));
        m71392b();
    }

    /* renamed from: f */
    public final void mo47190f(apga apga) {
        mo47696a(new aptx(this.f85140b, apga));
        m71392b();
    }

    /* renamed from: a */
    public final void mo47176a(int i, Bundle bundle) {
        mo47696a(new aqbc(null, null, this.f85139a, i, null, 2, bundle));
    }

    /* renamed from: b */
    public final void mo47186b(apga apga) {
        mo47696a(new aqcb(apga, null, this.f85139a, null, 0, null, 3));
    }

    /* renamed from: a */
    public final void mo47696a(aaab aaab) {
        this.f85141c.mo16659a(this.f85140b, aaab);
    }

    /* renamed from: a */
    public final void mo47178a(apga apga, int i) {
        mo47696a(new aqcb(apga, null, this.f85139a, Collections.singletonList(Integer.valueOf(i)), 0, null, 5));
    }

    /* renamed from: a */
    public final void mo47179a(apga apga, int i, String str) {
        mo47696a(new aqcb(apga, str, null, null, i, null, 6));
    }

    /* renamed from: a */
    public final void mo47180a(apga apga, String str) {
        mo47696a(new apvn(apga, str, this.f85139a));
    }

    /* renamed from: a */
    public final void mo47181a(apga apga, String str, int i, byte[] bArr) {
        mo47696a(new aqbc(apga, str, this.f85139a, i, bArr, 1, null));
    }

    /* renamed from: a */
    public final void mo47182a(apga apga, String str, byte[] bArr) {
        mo47696a(new aqbg(this.f85140b, apga, str, bArr));
    }

    /* renamed from: a */
    public final void mo47183a(apga apga, String str, int[] iArr, int i, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        mo47696a(new aqcb(apga, str, this.f85139a, arrayList, i, str2, 1));
    }
}
