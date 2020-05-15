package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.List;

/* renamed from: ajyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyi extends dck implements ajyj {

    /* renamed from: a */
    final /* synthetic */ aucf f71519a;

    public ajyi() {
        super("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
    }

    /* renamed from: a */
    public final void mo39084a(List list) {
        this.f71519a.mo50391a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajyi(aucf aucf) {
        super("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
        this.f71519a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo39084a(parcel.createTypedArrayList(Contact.CREATOR));
        return true;
    }
}
