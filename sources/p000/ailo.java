package p000;

import android.nfc.Tag;
import com.google.android.gms.nearby.mediums.NearFieldCommunication$1;

/* renamed from: ailo */
public final /* synthetic */ class ailo implements Runnable {

    /* renamed from: a */
    private final NearFieldCommunication$1 f69137a;

    /* renamed from: b */
    private final Tag f69138b;

    public ailo(NearFieldCommunication$1 nearFieldCommunication$1, Tag tag) {
        this.f69137a = nearFieldCommunication$1;
        this.f69138b = tag;
    }

    public final void run() {
        NearFieldCommunication$1 nearFieldCommunication$1 = this.f69137a;
        nearFieldCommunication$1.f80654a.mo37648a(this.f69138b);
    }
}
