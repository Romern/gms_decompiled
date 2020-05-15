package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import java.util.LinkedList;
import java.util.List;

/* renamed from: alnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnn extends alnd {

    /* renamed from: c */
    public final String f73853c;

    /* renamed from: d */
    public final List f73854d;

    /* renamed from: e */
    private final ParcelableGetOptions f73855e;

    /* renamed from: a */
    public final Pair mo40607a(Context context, almq almq, amph amph) {
        Bundle bundle = new Bundle();
        boolean z = false;
        bundle.putBoolean("response_complete", false);
        LinkedList linkedList = new LinkedList();
        if (this.f73855e.f81714d) {
            if (cfzx.m144057b()) {
                this.f73821b.mo40508a(amls.CP2);
            }
            if (this.f75731l == null) {
                Log.w("BasePeopleOperation", "Can not query gaia map, no account provided");
            } else if (!cfzu.f186219a.mo6606a().mo83173a()) {
                linkedList.add(new alnk(this));
            }
        }
        if (this.f73855e.f81711a) {
            if (cfzx.m144057b()) {
                this.f73821b.mo40508a(amls.OFFLINE);
            }
            if (this.f75731l != null) {
                linkedList.add(new alnl(this));
            } else {
                Log.w("BasePeopleOperation", "Can not query database, no account provided");
            }
        }
        linkedList.size();
        while (!linkedList.isEmpty()) {
            if (this.f75733p) {
                return new Pair(amqv.f75778d, null);
            }
            if (z) {
                mo40602a(amqv.f75777c, bundle);
            }
            z = ((alnm) linkedList.remove()).mo40611a(context, bundle);
        }
        bundle.putBoolean("response_complete", true);
        return new Pair(amqv.f75777c, bundle);
    }

    public alnn(String str, int i, String str2, alzm alzm, String str3, String str4, List list, ParcelableGetOptions parcelableGetOptions) {
        super(alzm, str, i, str2, str3, str4, "IdentityGetByIds", 5384);
        this.f73853c = str4;
        this.f73854d = list;
        this.f73855e = parcelableGetOptions;
    }
}
