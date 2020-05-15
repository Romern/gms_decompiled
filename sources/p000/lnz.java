package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: lnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lnz extends lim {

    /* renamed from: d */
    private final lqe f26486d = new lqe();

    public lnz(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
    }

    /* renamed from: a */
    public final void mo15164a() {
        bmxv bmxv;
        this.f26159a.setTheme(2132019642);
        this.f26159a.setContentView((int) C0126R.C0128layout.autofill_recyclerview_activity);
        Toolbar toolbar = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
        this.f26159a.mo8626a(toolbar);
        C1341rz aW = this.f26159a.mo8628aW();
        int i = this.f26160b.getInt("com.google.android.gms.autofill.extra.INSTRUMENTATION_POSITION");
        try {
            bmxv c = kwe.m18646a(this.f26159a.getApplicationContext()).mo14892c(i);
            bmxv = c.mo66813a() ? bmxv.m108567c(new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS", Locale.US).format(new Date(((kwh) c.mo66814b()).f25264b))) : bmvz.f131120a;
        } catch (InterruptedException | ExecutionException e) {
            bmxv = bmvz.f131120a;
        }
        if (aW != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("🐞 File: ");
            sb.append(i + 1);
            sb.append(" Debug Info");
            aW.mo15845a(sb.toString());
            if (bmxv.mo66813a()) {
                String valueOf = String.valueOf((String) bmxv.mo66814b());
                aW.mo15852b(valueOf.length() == 0 ? new String("\t\t\t\t\t") : "\t\t\t\t\t".concat(valueOf));
            }
            aW.mo15853b(true);
            toolbar.mo1678a(new lnv(this));
        }
        this.f26159a.findViewById(16908301).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26159a.findViewById(16908298);
        recyclerView.setLayoutManager(new aah());
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.f26486d);
        bngs bngs = new bngs();
        lny[] values = lny.values();
        for (lny lny : values) {
            String str = lny.f26484d;
            int i2 = lny.f26485e;
            lqg f = lql.m19524f();
            f.mo15376b(str);
            f.mo15374a(lnx.GENERIC_SUBTITLE.f26479b);
            f.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_info_grey600_24));
            f.mo15375a(new lqj(C0126R.C0127drawable.quantum_ic_arrow_forward_grey600_24));
            f.mo15373a(new lnw(this, i2, i));
            bngs.mo67668c(f.mo15372a());
        }
        this.f26486d.mo15371a(bngs.mo67664a());
    }

    /* renamed from: g */
    public final void mo15176g() {
        if (this.f26159a.getSupportFragmentManager().getBackStackEntryCount() == 0) {
            this.f26159a.finish();
            return;
        }
        C1341rz aW = this.f26159a.mo8628aW();
        if (aW != null) {
            aW.mo15845a("🐞 Debug Info");
        }
        this.f26159a.getSupportFragmentManager().popBackStack();
    }
}
