package p000;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* renamed from: lpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lpc extends lim {

    /* renamed from: e */
    public static final /* synthetic */ int f26525e = 0;

    /* renamed from: f */
    private static final bdyw f26526f;

    /* renamed from: g */
    private static final bngx f26527g;

    /* renamed from: d */
    public final Set f26528d = new HashSet();

    /* renamed from: h */
    private final lqe f26529h = new lqe();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw(anef.m64088a("com.google.android.gms.autofill")).mo58445a("gms:autofill:");
        f26526f = a;
        f26527g = bngx.m109367a(lpb.m19468a(bdyx.m91610a(a, "Autofill__recreate_detector_instance_on_fill_request", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "Autofill__payment_card_save_fix_flow_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "payment_card_save_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "payments_sandbox_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "CrowdsourcingPipeline__field_classification_apis_enabled", false), false), lpb.m19468a(bdyx.m91610a(f26526f, "CrowdsourcingPipeline__detection_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "Detection__ml_detection_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "Detection__otp_heuristics_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "PredictionDetection__enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "AgeDateAndGenderFieldTypes__is_age_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "AgeDateAndGenderFieldTypes__is_gender_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "AgeDateAndGenderFieldTypes__is_birthdate_individual_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "SmsOtpCodeAutofill__is_enabled", false), true), lpb.m19468a(bdyx.m91610a(f26526f, "InlinePresentationSupport__is_enabled", false), false));
    }

    public lpc(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
    }

    /* renamed from: a */
    public final void mo15164a() {
        this.f26159a.setTheme(2132019642);
        this.f26159a.setContentView((int) C0126R.C0128layout.autofill_recyclerview_activity);
        Toolbar toolbar = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
        this.f26159a.mo8626a(toolbar);
        C1341rz aW = this.f26159a.mo8628aW();
        if (aW != null) {
            aW.mo15845a("🏳️ Phenotype Flag Manager");
            aW.mo15853b(true);
            toolbar.mo1678a(new loq(this));
        }
        this.f26159a.findViewById(16908301).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26159a.findViewById(16908298);
        recyclerView.setLayoutManager(new aah());
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.f26529h);
        mo15333h();
    }

    /* renamed from: g */
    public final void mo15176g() {
        if (!this.f26528d.isEmpty()) {
            mo15332a(new lor(this));
        } else {
            super.mo15176g();
        }
    }

    /* renamed from: h */
    public final void mo15333h() {
        bngs j = bngx.m109377j();
        bnre i = f26527g.listIterator();
        while (i.hasNext()) {
            lpb lpb = (lpb) i.next();
            bdyx a = lpb.mo15296a();
            lqg f = lql.m19524f();
            f.mo15376b(a.mo58453b());
            f.mo15375a(new lqk(((Boolean) a.mo58455c()).booleanValue(), new los(this, lpb)));
            if (this.f26528d.contains(lpb)) {
                f.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_warning_amber_24));
            }
            j.mo67668c(f.mo15372a());
        }
        this.f26529h.mo15371a(j.mo67664a());
        this.f26529h.mo171aJ();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo15334i() {
        super.mo15176g();
    }

    /* renamed from: a */
    public final void mo15332a(Consumer consumer) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f26159a);
        builder.setTitle("GmsCore restart required");
        builder.setMessage("Updating this flag requires a GmsCore persistent process restart for the value to be set properly. Restart now?");
        builder.setPositiveButton("Restart GmsCore", new lou(this));
        builder.setNegativeButton("Later", new lov(consumer));
        consumer.getClass();
        builder.setOnCancelListener(new low(consumer));
        builder.show();
    }
}
