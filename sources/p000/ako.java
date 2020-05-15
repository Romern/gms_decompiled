package p000;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ako */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ako {

    /* renamed from: a */
    final Bundle f779a;

    /* renamed from: b */
    List f780b;

    /* renamed from: c */
    List f781c;

    public ako(Bundle bundle) {
        this.f779a = bundle;
    }

    /* renamed from: a */
    public static ako m943a(Bundle bundle) {
        if (bundle != null) {
            return new ako(bundle);
        }
        return null;
    }

    /* renamed from: b */
    public final List mo897b() {
        if (this.f780b == null) {
            ArrayList<String> stringArrayList = this.f779a.getStringArrayList("groupMemberIds");
            this.f780b = stringArrayList;
            if (stringArrayList == null) {
                this.f780b = Collections.emptyList();
            }
        }
        return this.f780b;
    }

    /* renamed from: c */
    public final String mo898c() {
        return this.f779a.getString("name");
    }

    /* renamed from: d */
    public final String mo899d() {
        return this.f779a.getString("status");
    }

    /* renamed from: e */
    public final Uri mo900e() {
        String string = this.f779a.getString("iconUri");
        if (string != null) {
            return Uri.parse(string);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo901f() {
        return this.f779a.getBoolean("enabled", true);
    }

    /* renamed from: g */
    public final int mo902g() {
        return this.f779a.getInt("connectionState", 0);
    }

    /* renamed from: h */
    public final boolean mo903h() {
        return this.f779a.getBoolean("canDisconnect", false);
    }

    /* renamed from: i */
    public final IntentSender mo904i() {
        return (IntentSender) this.f779a.getParcelable("settingsIntent");
    }

    /* renamed from: j */
    public final List mo905j() {
        mo906k();
        return this.f781c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo906k() {
        if (this.f781c == null) {
            ArrayList parcelableArrayList = this.f779a.getParcelableArrayList("controlFilters");
            this.f781c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f781c = Collections.emptyList();
            }
        }
    }

    /* renamed from: l */
    public final int mo907l() {
        return this.f779a.getInt("playbackType", 1);
    }

    /* renamed from: m */
    public final int mo908m() {
        return this.f779a.getInt("playbackStream", -1);
    }

    /* renamed from: n */
    public final int mo909n() {
        return this.f779a.getInt("deviceType");
    }

    /* renamed from: o */
    public final int mo910o() {
        return this.f779a.getInt("volume");
    }

    /* renamed from: p */
    public final int mo911p() {
        return this.f779a.getInt("volumeMax");
    }

    /* renamed from: q */
    public final int mo912q() {
        return this.f779a.getInt("volumeHandling", 0);
    }

    /* renamed from: r */
    public final int mo913r() {
        return this.f779a.getInt("presentationDisplayId", -1);
    }

    /* renamed from: s */
    public final Bundle mo914s() {
        return this.f779a.getBundle("extras");
    }

    /* renamed from: t */
    public final int mo915t() {
        return this.f779a.getInt("minClientVersion", 1);
    }

    public final String toString() {
        return "MediaRouteDescriptor{ id=" + mo896a() + ", groupMemberIds=" + mo897b() + ", name=" + mo898c() + ", description=" + mo899d() + ", iconUri=" + mo900e() + ", isEnabled=" + mo901f() + ", connectionState=" + mo902g() + ", controlFilters=" + Arrays.toString(mo905j().toArray()) + ", playbackType=" + mo907l() + ", playbackStream=" + mo908m() + ", deviceType=" + mo909n() + ", volume=" + mo910o() + ", volumeMax=" + mo911p() + ", volumeHandling=" + mo912q() + ", presentationDisplayId=" + mo913r() + ", extras=" + mo914s() + ", isValid=" + mo918v() + ", minClientVersion=" + mo915t() + ", maxClientVersion=" + mo917u() + " }";
    }

    /* renamed from: u */
    public final int mo917u() {
        return this.f779a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    /* renamed from: v */
    public final boolean mo918v() {
        mo906k();
        return !TextUtils.isEmpty(mo896a()) && !TextUtils.isEmpty(mo898c()) && !this.f781c.contains(null);
    }

    /* renamed from: a */
    public final String mo896a() {
        return this.f779a.getString("id");
    }
}
