package p000;

import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: akn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akn {

    /* renamed from: a */
    public final Bundle f776a;

    /* renamed from: b */
    private ArrayList f777b;

    /* renamed from: c */
    private ArrayList f778c;

    public akn(ako ako) {
        if (ako != null) {
            this.f776a = new Bundle(ako.f779a);
            if (!ako.mo897b().isEmpty()) {
                this.f777b = new ArrayList(ako.mo897b());
            }
            if (!ako.mo905j().isEmpty()) {
                this.f778c = new ArrayList(ako.f781c);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }

    /* renamed from: a */
    public final ako mo880a() {
        ArrayList arrayList = this.f778c;
        if (arrayList != null) {
            this.f776a.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList arrayList2 = this.f777b;
        if (arrayList2 != null) {
            this.f776a.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new ako(this.f776a);
    }

    /* renamed from: b */
    public final void mo886b() {
        this.f776a.putBoolean("canDisconnect", false);
    }

    /* renamed from: c */
    public final void mo889c() {
        this.f776a.putInt("minClientVersion", 2);
    }

    /* renamed from: d */
    public final void mo891d(int i) {
        this.f776a.putInt("playbackType", i);
    }

    /* renamed from: e */
    public final void mo892e(int i) {
        this.f776a.putInt("presentationDisplayId", i);
    }

    /* renamed from: f */
    public final void mo893f(int i) {
        this.f776a.putInt("volume", i);
    }

    /* renamed from: g */
    public final void mo894g(int i) {
        this.f776a.putInt("volumeHandling", i);
    }

    /* renamed from: h */
    public final void mo895h(int i) {
        this.f776a.putInt("volumeMax", i);
    }

    /* renamed from: b */
    public final void mo887b(int i) {
        this.f776a.putInt("deviceType", i);
    }

    /* renamed from: c */
    public final void mo890c(int i) {
        this.f776a.putInt("maxClientVersion", i);
    }

    /* renamed from: b */
    public final void mo888b(String str) {
        this.f776a.putString("status", str);
    }

    /* renamed from: a */
    public final void mo881a(int i) {
        this.f776a.putInt("connectionState", i);
    }

    /* renamed from: a */
    public final void mo882a(Bundle bundle) {
        this.f776a.putBundle("extras", bundle);
    }

    public akn(String str, String str2) {
        Bundle bundle = new Bundle();
        this.f776a = bundle;
        bundle.putString("id", str);
        this.f776a.putString("name", str2);
    }

    /* renamed from: a */
    public final void mo883a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f777b == null) {
                this.f777b = new ArrayList();
            }
            if (!this.f777b.contains(str)) {
                this.f777b.add(str);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("groupMemberId must not be empty");
    }

    /* renamed from: a */
    public final void mo884a(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        } else if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    if (this.f778c == null) {
                        this.f778c = new ArrayList();
                    }
                    if (!this.f778c.contains(intentFilter)) {
                        this.f778c.add(intentFilter);
                    }
                } else {
                    throw new IllegalArgumentException("filter must not be null");
                }
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo885a(boolean z) {
        this.f776a.putBoolean("connecting", z);
    }
}
