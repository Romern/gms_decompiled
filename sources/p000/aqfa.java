package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfa {

    /* renamed from: a */
    public static final String[] f85934a = {"os.config.ppgl.dir", "os.config.ppgl.version", "os.config.ppgl.status", "os.config.ppgl.cd"};

    /* renamed from: b */
    public final aqez f85935b;

    static {
        aqfa.class.getSimpleName();
    }

    public aqfa(Bundle bundle) {
        this.f85935b = new aqez(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47809a() {
        aqez aqez = this.f85935b;
        int i = aqez.f85933a.getInt("snet_max_setuid_files_chars");
        return i == 0 ? aqez.f85933a.getInt("max_setuid_files_chars", 2000) : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47810b() {
        return this.f85935b.mo47807b("report_non_system_apps");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo47811c() {
        return this.f85935b.mo47807b("report_system_apps");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo47812d() {
        return this.f85935b.mo47806a("debug_status");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List mo47813e() {
        aqez aqez = this.f85935b;
        ArrayList<String> stringArrayList = aqez.f85933a.getStringArrayList("snet_verify_apps_api_usage");
        return (stringArrayList == null || stringArrayList.isEmpty()) ? aqez.f85933a.getStringArrayList("verify_apps_api_usage") : stringArrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final byte[] mo47814f() {
        byte[] c = this.f85935b.mo47808c("cached_logs");
        return c == null ? this.f85935b.mo47808c("snet.intent.extra.CACHED_LOGS") : c;
    }
}
