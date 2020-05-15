package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.Set;

/* renamed from: aygz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aygz {

    /* renamed from: g */
    final String f97557g;

    /* renamed from: h */
    public final Intent f97558h;

    public aygz(String str, Intent intent) {
        sdo.m34959a((Object) str);
        this.f97557g = str;
        sdo.m34959a(intent);
        this.f97558h = intent;
    }

    /* renamed from: a */
    public String mo53988a() {
        throw null;
    }

    /* renamed from: a */
    public abstract void mo53989a(aygk aygk, axrv axrv);

    public final String toString() {
        return "Event[" + hashCode() + ": " + this.f97557g + ", event=" + mo53988a() + "]";
    }

    /* renamed from: a */
    public boolean mo53997a(IntentFilter[] intentFilterArr, boolean z, String str, String str2) {
        IntentFilter[] intentFilterArr2 = intentFilterArr;
        if (intentFilterArr2 == null) {
            return true;
        }
        String action = this.f97558h.getAction();
        String scheme = this.f97558h.getScheme();
        Uri data = this.f97558h.getData();
        Set<String> categories = this.f97558h.getCategories();
        int length = intentFilterArr2.length;
        int i = 0;
        while (i < length) {
            int i2 = i;
            if (intentFilterArr2[i].match(action, null, scheme, data, categories, "WearableServiceEvent") > 0) {
                return true;
            }
            i = i2 + 1;
        }
        return false;
    }
}
