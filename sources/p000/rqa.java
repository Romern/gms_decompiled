package p000;

import android.content.Intent;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqa {

    /* renamed from: a */
    public final Intent f43513a;

    public rqa(Intent intent) {
        this.f43513a = new Intent(intent);
    }

    /* renamed from: a */
    public static int m34222a(Intent intent, int i) {
        return intent.getIntExtra("com.google.android.gms.common.acl.EXTRA_HEADER_TEXT_COLOR", i);
    }

    /* renamed from: b */
    public static int m34226b(Intent intent, int i) {
        return intent.getIntExtra("com.google.android.gms.common.acl.EXTRA_HEADER_BACKGROUND_COLOR", i);
    }

    /* renamed from: c */
    public static AudienceMember m34228c(Intent intent) {
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON")) {
            return (AudienceMember) sef.m35067a(intent, "com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON", AudienceMember.CREATOR);
        }
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON_ID")) {
            return AudienceMember.m22641b(intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON_ID"), null, null);
        }
        return null;
    }

    /* renamed from: d */
    public static String m34229d(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_TITLE_TEXT");
    }

    /* renamed from: e */
    public static List m34230e(Intent intent) {
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE")) {
            return intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE");
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public static ArrayList m34231f(Intent intent) {
        ArrayList arrayList = new ArrayList();
        List e = m34230e(intent);
        if (e != null && !e.isEmpty()) {
            arrayList.addAll(e);
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE");
        if (parcelableArrayListExtra != null) {
            arrayList.removeAll(parcelableArrayListExtra);
        }
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE");
        if (parcelableArrayListExtra2 != null) {
            arrayList.addAll(parcelableArrayListExtra2);
        }
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m34232g(Intent intent) {
        return intent.getBooleanExtra("ALL_CIRCLES_CHECKED", false);
    }

    /* renamed from: h */
    public static boolean m34233h(Intent intent) {
        return intent.getBooleanExtra("ALL_CONTACTS_CHECKED", false);
    }

    /* renamed from: i */
    public static int m34234i(Intent intent) {
        return intent.getIntExtra("com.google.android.gms.common.acl.EXTRA_DOMAIN_RESTRICTED", 0);
    }

    /* renamed from: j */
    public static boolean m34235j(Intent intent) {
        return intent.getBooleanExtra("LOAD_CIRCLES", true);
    }

    /* renamed from: k */
    public static boolean m34236k(Intent intent) {
        return intent.getBooleanExtra("LOAD_PEOPLE", true);
    }

    /* renamed from: l */
    public static boolean m34237l(Intent intent) {
        return intent.getBooleanExtra("EXTRA_SEARCH_DEVICE", false);
    }

    public rqa(String str) {
        this(new Intent(str).setPackage("com.google.android.gms"));
    }

    /* renamed from: a */
    public static String m34223a(Intent intent) {
        return intent.getStringExtra("DESCRIPTION_TEXT");
    }

    /* renamed from: b */
    public static String m34227b(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_CLIENT_APPLICATION_ID");
    }

    /* renamed from: d */
    public final void mo25019d(String str) {
        this.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_CLIENT_APPLICATION_ID", str);
    }

    /* renamed from: a */
    public static ArrayList m34224a(List list) {
        if (list instanceof ArrayList) {
            return (ArrayList) list;
        }
        return new ArrayList(list);
    }

    /* renamed from: b */
    public final void mo25011b(String str) {
        this.f43513a.putExtra("DESCRIPTION_TEXT", str);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25020d(boolean z) {
        this.f43513a.putExtra("SHOW_ALL_CIRCLES_CHECKBOX", z);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25021e(boolean z) {
        this.f43513a.putExtra("SHOW_ALL_CONTACTS_CHECKBOX", z);
    }

    /* renamed from: b */
    public final void mo25012b(ArrayList arrayList) {
        this.f43513a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE", arrayList);
    }

    /* renamed from: a */
    public static boolean m34225a(Intent intent, boolean z) {
        return intent.getBooleanExtra("SHOULD_LOAD_GROUPS", z);
    }

    /* renamed from: b */
    public final void mo25013b(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f43513a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE", m34224a(list));
    }

    /* renamed from: c */
    public final ArrayList mo25016c() {
        return m34231f(this.f43513a);
    }

    /* renamed from: a */
    public final void mo25005a(int i) {
        this.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_DOMAIN_RESTRICTED", i);
    }

    /* renamed from: c */
    public final void mo25017c(String str) {
        this.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_PLUS_PAGE_ID", str);
    }

    /* renamed from: a */
    public final void mo25006a(AudienceMember audienceMember) {
        sef.m35071a(audienceMember, this.f43513a, "com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON");
    }

    /* renamed from: b */
    public final void mo25014b(boolean z) {
        this.f43513a.putExtra("ALL_CONTACTS_CHECKED", z);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo25018c(boolean z) {
        this.f43513a.putExtra("HAS_SHOW_CIRCLES", z);
    }

    /* renamed from: a */
    public final void mo25007a(String str) {
        this.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME", str);
    }

    /* renamed from: b */
    public final boolean mo25015b() {
        return m34233h(this.f43513a);
    }

    /* renamed from: a */
    public final void mo25008a(ArrayList arrayList) {
        this.f43513a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE", arrayList);
    }

    /* renamed from: a */
    public final void mo25009a(boolean z) {
        this.f43513a.putExtra("ALL_CIRCLES_CHECKED", z);
    }

    /* renamed from: a */
    public final boolean mo25010a() {
        return m34232g(this.f43513a);
    }
}
