package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajcc extends dck implements ajcd {

    /* renamed from: a */
    private final rod f70353a;

    public ajcc() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    /* renamed from: a */
    public final void mo38478a(MessageWrapper messageWrapper) {
    }

    /* renamed from: b */
    public final void mo38480b(MessageWrapper messageWrapper) {
    }

    /* renamed from: a */
    public static void m58482a(Intent intent, aixf aixf) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        m58483a(bundleExtra != null ? bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES") : Collections.emptyList(), aixf);
    }

    public ajcc(rod rod) {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
        this.f70353a = rod;
    }

    /* renamed from: a */
    public static void m58483a(Iterable iterable, aixf aixf) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Update update = (Update) it.next();
            aixf.mo37004a(update);
            if (update.mo44364a(1)) {
                aixf.mo9885a(update.f80795c);
            }
            if (update.mo44364a(2)) {
                aixf.mo9886b(update.f80795c);
            }
            if (update.mo44364a(4)) {
                Message message = update.f80795c;
                DistanceImpl distanceImpl = update.f80796d;
            }
            if (update.mo44364a(8)) {
                aixf.mo37003a(update.f80795c, update.f80797e);
            }
            if (update.mo44364a(16)) {
                aixf.mo37002a(update.f80795c, update.f80798f);
            }
        }
    }

    /* renamed from: a */
    public final void mo38479a(List list) {
        this.f70353a.mo24968a(new ajdx(list));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            MessageWrapper messageWrapper = (MessageWrapper) dcl.m8163a(parcel, MessageWrapper.CREATOR);
        } else if (i == 2) {
            MessageWrapper messageWrapper2 = (MessageWrapper) dcl.m8163a(parcel, MessageWrapper.CREATOR);
        } else if (i != 4) {
            return false;
        } else {
            mo38479a(parcel.createTypedArrayList(Update.CREATOR));
        }
        return true;
    }
}
