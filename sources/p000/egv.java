package p000;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: egv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egv {

    /* renamed from: a */
    public final HashMap f14887a = new HashMap();

    /* renamed from: b */
    public final SparseArray f14888b = new SparseArray();

    /* renamed from: c */
    public final ArrayList f14889c = new ArrayList();

    /* renamed from: d */
    public String f14890d;

    /* renamed from: e */
    private long f14891e;

    public egv() {
        mo10115a();
    }

    /* renamed from: a */
    public final void mo10115a() {
        this.f14887a.clear();
        this.f14888b.clear();
        this.f14889c.clear();
        this.f14890d = null;
        this.f14891e = dwq.m9665i().mo20505a();
    }

    /* renamed from: b */
    public final boolean mo10117b() {
        return this.f14887a.isEmpty();
    }

    /* renamed from: c */
    public final tnt mo10118c() {
        bxvd da = tnt.f46353g.mo74144da();
        long j = this.f14891e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        tnt tnt = (tnt) da.f164949b;
        tnt.f46355a |= 1;
        tnt.f46356b = j;
        long a = dwq.m9665i().mo20505a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        tnt tnt2 = (tnt) da.f164949b;
        tnt2.f46355a |= 2;
        tnt2.f46357c = a;
        ArrayList arrayList = new ArrayList(this.f14887a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            egu egu = (egu) this.f14887a.get(str);
            bxvd da2 = tns.f46340l.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns = (tns) da2.f164949b;
            str.getClass();
            tns.f46342a |= 1;
            tns.f46343b = str;
            for (int i2 = 0; i2 < 16; i2++) {
                int i3 = egu.f14882b[i2];
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                tns tns2 = (tns) da2.f164949b;
                if (!tns2.f46344c.mo73666a()) {
                    tns2.f46344c = bxvk.m124019a(tns2.f46344c);
                }
                tns2.f46344c.mo74153d(i3);
            }
            long a2 = egu.mo10110a(0);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns3 = (tns) da2.f164949b;
            tns3.f46342a |= 2;
            tns3.f46345d = a2;
            long b = egu.mo10112b(0);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns4 = (tns) da2.f164949b;
            tns4.f46342a |= 4;
            tns4.f46346e = b;
            long c = egu.mo10113c(0);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns5 = (tns) da2.f164949b;
            tns5.f46342a |= 8;
            tns5.f46347f = c;
            long d = egu.mo10114d(0);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns6 = (tns) da2.f164949b;
            tns6.f46342a = 16 | tns6.f46342a;
            tns6.f46348g = d;
            long a3 = egu.mo10110a(1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns7 = (tns) da2.f164949b;
            tns7.f46342a |= 32;
            tns7.f46349h = a3;
            long b2 = egu.mo10112b(1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns8 = (tns) da2.f164949b;
            tns8.f46342a |= 64;
            tns8.f46350i = b2;
            long c2 = egu.mo10113c(1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns9 = (tns) da2.f164949b;
            tns9.f46342a |= 128;
            tns9.f46351j = c2;
            long d2 = egu.mo10114d(1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tns tns10 = (tns) da2.f164949b;
            tns10.f46342a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            tns10.f46352k = d2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnt tnt3 = (tnt) da.f164949b;
            tns tns11 = (tns) da2.mo74062i();
            tns11.getClass();
            if (!tnt3.f46358d.mo73666a()) {
                tnt3.f46358d = bxvk.m124021a(tnt3.f46358d);
            }
            tnt3.f46358d.add(tns11);
        }
        if (this.f14888b.size() > 0) {
            for (int i4 = 0; i4 < this.f14888b.size(); i4++) {
                egt egt = (egt) this.f14888b.valueAt(i4);
                ArrayList arrayList2 = new ArrayList(egt.f14880b.keySet());
                Collections.sort(arrayList2);
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = (String) arrayList2.get(i5);
                    bxvd da3 = tnr.f46331h.mo74144da();
                    bxco bxco = egt.f14879a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    tnr tnr = (tnr) da3.f164949b;
                    tnr.f46334b = bxco.f162973bD;
                    tnr.f46333a |= 1;
                    String a4 = dof.m8923a(str2);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    tnr tnr2 = (tnr) da3.f164949b;
                    a4.getClass();
                    tnr2.f46333a |= 32;
                    tnr2.f46339g = a4;
                    egs egs = (egs) egt.f14880b.get(str2);
                    int i6 = egs != null ? egs.f14875a : 0;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    tnr tnr3 = (tnr) da3.f164949b;
                    tnr3.f46333a |= 2;
                    tnr3.f46335c = i6;
                    egs egs2 = (egs) egt.f14880b.get(str2);
                    int i7 = egs2 != null ? egs2.f14876b : 0;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    tnr tnr4 = (tnr) da3.f164949b;
                    tnr4.f46333a |= 4;
                    tnr4.f46336d = i7;
                    egs egs3 = (egs) egt.f14880b.get(str2);
                    int i8 = egs3 != null ? egs3.f14877c : 0;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    tnr tnr5 = (tnr) da3.f164949b;
                    tnr5.f46333a |= 8;
                    tnr5.f46337e = i8;
                    egs egs4 = (egs) egt.f14880b.get(str2);
                    int i9 = egs4 != null ? egs4.f14878d : 0;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    tnr tnr6 = (tnr) da3.f164949b;
                    tnr6.f46333a |= 16;
                    tnr6.f46338f = i9;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    tnt tnt4 = (tnt) da.f164949b;
                    tnr tnr7 = (tnr) da3.mo74062i();
                    tnr7.getClass();
                    if (!tnt4.f46359e.mo73666a()) {
                        tnt4.f46359e = bxvk.m124021a(tnt4.f46359e);
                    }
                    tnt4.f46359e.add(tnr7);
                }
            }
        }
        if (!this.f14889c.isEmpty()) {
            ArrayList arrayList3 = this.f14889c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnt tnt5 = (tnt) da.f164949b;
            if (!tnt5.f46360f.mo73666a()) {
                tnt5.f46360f = bxvk.m124021a(tnt5.f46360f);
            }
            bxsy.m123078a(arrayList3, tnt5.f46360f);
        }
        return (tnt) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo10116a(dqx dqx) {
        String str = dqx.f13840a;
        egu egu = (egu) this.f14887a.get(str);
        if (egu == null) {
            egu = new egu(str);
            this.f14887a.put(str, egu);
        }
        if (TextUtils.equals(dqx.f13840a, egu.f14881a)) {
            int[] iArr = egu.f14882b;
            int i = dqx.f13845f;
            iArr[i] = iArr[i] + 1;
            if (i == 0) {
                egu.mo10111a(dqx.mo9465d(), 0);
                egu.mo10111a(dqx.mo9466e(), 1);
                return;
            }
            return;
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("egv", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[WorkInfoSummary] Could not add work info: %s", dqx);
    }
}
