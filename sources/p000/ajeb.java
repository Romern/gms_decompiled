package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ajeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajeb implements aixa {

    /* renamed from: a */
    public final SparseArray f70410a;

    /* renamed from: b */
    public final buqh f70411b;

    /* renamed from: c */
    private final aiyz f70412c;

    /* renamed from: d */
    private final Context f70413d;

    /* renamed from: e */
    private final ajat f70414e;

    public ajeb(Context context) {
        SparseArray sparseArray = new SparseArray();
        this.f70414e = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70413d = context;
        this.f70412c = (aiyz) ahgz.m55754a(context, aiyz.class);
        this.f70410a = sparseArray;
        this.f70411b = (buqh) ahgz.m55754a(context, buqh.class);
        ((aixb) ahgz.m55754a(this.f70413d, aixb.class)).mo38196a(this);
    }

    /* renamed from: a */
    public final Set mo38538a() {
        this.f70411b.mo72984b();
        HashSet hashSet = new HashSet();
        if (this.f70412c.f70125a.mo38214a()) {
            hashSet.add(bzbu.AUDIO_AUDIBLE_DTMF);
        }
        if (this.f70412c.f70127c.mo38214a()) {
            hashSet.add(bzbu.AUDIO_ULTRASOUND_PASSBAND);
        }
        if (this.f70414e.mo38424j() && mo38540a(bzbu.BLUETOOTH_CLASSIC_NAME)) {
            hashSet.add(bzbu.BLUETOOTH_CLASSIC_NAME);
        }
        if (this.f70414e.mo38425k() && mo38540a(bzbu.BLE_ADVERTISING_PACKET)) {
            hashSet.add(bzbu.BLE_ADVERTISING_PACKET);
        }
        return hashSet;
    }

    /* renamed from: b */
    public final byzn[] mo38541b(int i) {
        this.f70411b.mo72984b();
        return (byzn[]) this.f70410a.get(i);
    }

    /* renamed from: a */
    public final void mo38195a(int i) {
        int i2;
        this.f70411b.mo72984b();
        this.f70411b.mo72984b();
        srn srn = ahfq.f67120a;
        for (int i3 = 0; i3 < this.f70410a.size(); i3++) {
            int keyAt = this.f70410a.keyAt(i3);
            byzn[] b = mo38541b(keyAt);
            if (b == null) {
                i2 = 0;
            } else {
                i2 = 0;
                while (i2 < b.length && b[i2].f169136d <= SystemClock.elapsedRealtime()) {
                    i2++;
                }
            }
            if (i2 > 0) {
                int length = b.length - i2;
                byzn[] byznArr = new byzn[length];
                System.arraycopy(b, i2, byznArr, 0, length);
                mo38539a(bzbu.m125627a(keyAt), byznArr);
            }
        }
    }

    /* renamed from: a */
    public final void mo38539a(bzbu bzbu, byzn[] byznArr) {
        this.f70411b.mo72984b();
        this.f70410a.put(bzbu.f169275k, byznArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo38540a(bzbu bzbu) {
        this.f70411b.mo72984b();
        Context context = this.f70413d;
        return aixs.m58137a(context, (buye) ahgz.m55755b(context, buye.class), bzbu);
    }
}
