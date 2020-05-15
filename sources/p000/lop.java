package p000;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: lop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lop extends lim {

    /* renamed from: d */
    public final kre f26504d = krc.m18382a(this.f26159a);

    /* renamed from: e */
    private final lqe f26505e = new lqe();

    /* renamed from: f */
    private View f26506f;

    /* renamed from: g */
    private RecyclerView f26507g;

    public lop(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
    }

    /* renamed from: a */
    private static String m19462a(bmxv bmxv) {
        if (!bmxv.mo66813a()) {
            return "(default)";
        }
        String uri = ((Uri) bmxv.mo66814b()).toString();
        return uri.length() > 50 ? uri.substring(0, 50) : uri;
    }

    /* renamed from: h */
    public final void mo15320h() {
        bngs bngs = new bngs();
        lqg f = lql.m19524f();
        f.mo15376b("Phenotype Flag Manager");
        f.mo15374a("Lists and allows overriding supported Phenotype flags.");
        f.mo15375a(new lqj(C0126R.C0127drawable.quantum_ic_arrow_forward_grey600_24));
        f.mo15373a(new C1168log(this));
        lqg f2 = lql.m19524f();
        f2.mo15376b("Force opt out");
        f2.mo15374a("To opt in again, navigate to the main settings page");
        f2.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_logout_grey600_24));
        f2.mo15373a(new loh(this));
        bngs.mo67667b((Object[]) new lql[]{f.mo15372a(), f2.mo15372a()});
        lqg f3 = lql.m19524f();
        f3.mo15376b("Update prediction data");
        f3.mo15374a("Forces syncing of the crowdsourcing and truth data");
        f3.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_update_grey600_24));
        f3.mo15373a(new loi(this));
        bngs.mo67668c(f3.mo15372a());
        lqg f4 = lql.m19524f();
        f4.mo15376b("Show detection fill option");
        f4.mo15374a("Displays a fill option for every field displaying what type of field autofill detected and the detection method used");
        f4.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_info_grey600_24));
        f4.mo15375a(new lqk(this.f26504d.mo14831f().mo15087g(), new loj(this)));
        bngs.mo67668c(f4.mo15372a());
        lqg f5 = lql.m19524f();
        f5.mo15376b("Show submit feedback option");
        f5.mo15374a("Displays an option below fields allowing users to send feedback to the autofill team");
        f5.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_feedback_grey600_24));
        f5.mo15375a(new lqk(this.f26504d.mo14831f().mo15088h(), new lok(this)));
        bngs.mo67668c(f5.mo15372a());
        lqg f6 = lql.m19524f();
        f6.mo15376b("Show debug info option");
        f6.mo15374a("Displays an option below fields allowing you to view the debug information and enable instrumentation recording");
        f6.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_message_grey600_24));
        f6.mo15375a(new lqk(this.f26504d.mo14831f().mo15089i(), new lol(this)));
        bngs.mo67668c(f6.mo15372a());
        lqg f7 = lql.m19524f();
        f7.mo15376b("Show Debug Instrumentation Files");
        f7.mo15374a("Launches activity displaying the instrumentation files currently stored on disk");
        f7.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_format_list_numbered_grey600_24));
        f7.mo15375a(new lqj(C0126R.C0127drawable.quantum_ic_arrow_forward_grey600_24));
        f7.mo15373a(new lom(this));
        bngs.mo67668c(f7.mo15372a());
        lhh j = this.f26504d.mo14831f().mo15090j();
        lqg f8 = lql.m19524f();
        f8.mo15376b("Override field detection model");
        String a = m19462a(j.mo15075a());
        String a2 = m19462a(j.mo15076b());
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 25 + String.valueOf(a2).length());
        sb.append("Neural Network: ");
        sb.append(a);
        sb.append("\nConfig: ");
        sb.append(a2);
        f8.mo15374a(sb.toString());
        f8.mo15375a(new lqh("Choose Files", new lon(this)));
        bngs.mo67668c(f8.mo15372a());
        lqg f9 = lql.m19524f();
        f9.mo15376b("Clear field detection model override");
        f9.mo15374a("Tap to clear all field detection model overrides.");
        f9.mo15373a(new loe(this));
        bngs.mo67668c(f9.mo15372a());
        this.f26505e.mo15371a(bngs.mo67664a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[SYNTHETIC] */
    /* renamed from: a */
    private final void m19463a(List list) {
        String str;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 2) {
            Toast.makeText(this.f26159a, "You should only select up to two files", 1).show();
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            Cursor query = this.f26159a.getContentResolver().query(uri, null, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                        if (str != null) {
                            if (str.endsWith(".bundle")) {
                                this.f26504d.mo14830e().mo15100a(bmxv.m108566b(uri));
                            } else if (str.endsWith(".fb_bin")) {
                                this.f26504d.mo14830e().mo15103b(bmxv.m108566b(uri));
                            }
                        }
                    }
                } finally {
                    query.close();
                }
            }
            query.close();
            str = null;
            if (str != null) {
            }
        }
        mo15320h();
    }

    /* renamed from: a */
    public final void mo15164a() {
        this.f26159a.setTheme(2132019642);
        this.f26159a.setContentView((int) C0126R.C0128layout.autofill_recyclerview_activity);
        Toolbar toolbar = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
        this.f26159a.mo8626a(toolbar);
        C1341rz aW = this.f26159a.mo8628aW();
        if (aW != null) {
            aW.mo15845a("🐞 Debug settings");
            aW.mo15853b(true);
            toolbar.mo1678a(new lod(this));
        }
        View findViewById = this.f26159a.findViewById(16908301);
        this.f26506f = findViewById;
        findViewById.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26159a.findViewById(16908298);
        this.f26507g = recyclerView;
        recyclerView.setLayoutManager(new aah());
        this.f26507g.setVisibility(0);
        this.f26507g.setAdapter(this.f26505e);
        mo15320h();
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i == 42 && i2 == -1 && intent != null) {
            Uri data = intent.getData();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                bngs b = bngx.m109371b(clipData.getItemCount());
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    Uri uri = clipData.getItemAt(i3).getUri();
                    if (uri != null) {
                        b.mo67668c(uri);
                    }
                }
                m19463a(b.mo67664a());
            } else if (data != null) {
                m19463a(bngx.m109356a(data));
            }
        }
    }
}
