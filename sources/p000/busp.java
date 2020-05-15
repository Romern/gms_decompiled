package p000;

import android.content.Intent;
import android.net.Uri;
import java.net.URISyntaxException;

/* renamed from: busp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busp {

    /* renamed from: a */
    public static final Uri f154817a = m120391a("device_details_update");

    /* renamed from: a */
    public static Uri m120391a(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath(str).build();
    }

    /* renamed from: b */
    public static String m120393b(String str) {
        try {
            return Intent.parseUri(str, 0).getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
        } catch (URISyntaxException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("busp", "b", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: Failed to get companion app from intent.");
            return null;
        }
    }

    /* renamed from: a */
    public static void m120392a(apr apr, boolean z) {
        bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
        bnsl.mo68432a("busp", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        Boolean valueOf = Boolean.valueOf(z);
        bnsl.mo68420a("FastPairSlice: enableBindServiceForDiscoveryItem called, isBind = %b", valueOf);
        try {
            apr.mo2277c(new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("method_bind_service_for_discovery_item").appendQueryParameter("is_bind", valueOf.toString()).build());
        } catch (NullPointerException e) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("busp", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("FastPairSlice: enableBindServiceForDiscoveryItem meet exception!");
        }
    }
}
