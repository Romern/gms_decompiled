package p000;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: ahqs */
final /* synthetic */ class ahqs implements Runnable {

    /* renamed from: a */
    private final ahkv f67824a;

    /* renamed from: b */
    private final String[] f67825b;

    /* renamed from: c */
    private final ParcelablePayload f67826c;

    public ahqs(ahkv ahkv, String[] strArr, ParcelablePayload parcelablePayload) {
        this.f67824a = ahkv;
        this.f67825b = strArr;
        this.f67826c = parcelablePayload;
    }

    public final void run() {
        long j;
        ahkv ahkv = this.f67824a;
        String[] strArr = this.f67825b;
        ParcelablePayload parcelablePayload = this.f67826c;
        ahkl ahkl = ahkv.f67390f;
        long j2 = parcelablePayload.f80605a;
        int a = buus.m120474a(parcelablePayload.f80606b);
        int i = parcelablePayload.f80606b;
        if (i != 1) {
            j = i != 2 ? -1 : parcelablePayload.f80610f;
        } else {
            j = (long) parcelablePayload.f80607c.length;
        }
        ahkl.mo36663a(strArr, j2, a, j);
    }
}
