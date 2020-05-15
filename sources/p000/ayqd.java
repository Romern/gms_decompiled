package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: ayqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqd extends dck implements ayqe {

    /* renamed from: a */
    private final Context f98228a;

    /* renamed from: b */
    private ahts f98229b;

    public ayqd() {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
    }

    /* renamed from: a */
    public final void mo54219a(Event event) {
        srn srn = ahsd.f67925a;
        ahts ahts = this.f98229b;
        if (ahts != null) {
            ahts.mo37156a(event);
        } else {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: Did not initialize logger.");
        }
    }

    /* renamed from: b */
    public final void mo54221b(Event event) {
        srn srn = ahsd.f67925a;
        ahts ahts = this.f98229b;
        if (ahts != null) {
            ahts.mo37157a(event, event.mo60336e());
        } else {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: Did not initialize logger.");
        }
    }

    public ayqd(Context context) {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
        this.f98228a = context;
    }

    /* renamed from: a */
    public final void mo54220a(String str, String str2) {
        srn srn = ahsd.f67925a;
        this.f98229b = new ahts(new ahti(str, str2, this.f98228a));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo54220a(parcel.readString(), parcel.readString());
        } else if (i == 2) {
            mo54219a((Event) dcl.m8163a(parcel, Event.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo54221b((Event) dcl.m8163a(parcel, Event.CREATOR));
        }
        return true;
    }
}
