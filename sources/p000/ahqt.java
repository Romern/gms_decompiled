package p000;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: ahqt */
final /* synthetic */ class ahqt implements Runnable {

    /* renamed from: a */
    private final ahra f67827a;

    /* renamed from: b */
    private final ahkv f67828b;

    /* renamed from: c */
    private final String[] f67829c;

    /* renamed from: d */
    private final ParcelablePayload f67830d;

    public ahqt(ahra ahra, ahkv ahkv, String[] strArr, ParcelablePayload parcelablePayload) {
        this.f67827a = ahra;
        this.f67828b = ahkv;
        this.f67829c = strArr;
        this.f67830d = parcelablePayload;
    }

    public final void run() {
        ahra ahra = this.f67827a;
        ahkv ahkv = this.f67828b;
        String[] strArr = this.f67829c;
        ParcelablePayload parcelablePayload = this.f67830d;
        ahra.mo36993a(ahkv, strArr, parcelablePayload);
        for (String str : strArr) {
            ahkv.f67390f.mo36658a(str, parcelablePayload.f80605a, bvih.LOCAL_ERROR);
        }
    }
}
