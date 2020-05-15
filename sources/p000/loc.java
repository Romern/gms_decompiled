package p000;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: loc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class loc extends lim {

    /* renamed from: d */
    private kre f26491d;

    public loc(lir lir, Bundle bundle, bngx bngx) {
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
            aW.mo15845a("🐞 Instrumentation Files");
            aW.mo15853b(true);
            toolbar.mo1678a(new loa(this));
        }
        this.f26159a.findViewById(16908301).setVisibility(8);
        lqe lqe = new lqe();
        RecyclerView recyclerView = (RecyclerView) this.f26159a.findViewById(16908298);
        recyclerView.setLayoutManager(new aah());
        int i = 0;
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(lqe);
        this.f26491d = krc.m18382a(this.f26159a.getApplicationContext());
        ArrayList a = kwe.m18646a(this.f26159a.getApplicationContext()).mo14882a();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS", Locale.US);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(simpleDateFormat.format(new Date(((kwh) a.get(i2)).f25264b)));
        }
        bngs bngs = new bngs();
        String[] strArr = {"st", "nd", "rd", "th", "th"};
        while (i < arrayList.size()) {
            String str = strArr[i];
            lqg f = lql.m19524f();
            String str2 = (String) arrayList.get(i);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17);
            sb.append("File");
            int i3 = i + 1;
            sb.append(i3);
            sb.append(": ");
            sb.append(str2);
            f.mo15376b(sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 28);
            sb2.append(i3);
            sb2.append(str);
            sb2.append(" most recent file");
            f.mo15374a(sb2.toString());
            f.mo15377b(new lqj(C0126R.C0127drawable.quantum_ic_drive_file_grey600_24));
            f.mo15373a(new lob(this, i));
            bngs.mo67668c(f.mo15372a());
            i = i3;
        }
        lqe.mo15371a(bngs.mo67664a());
    }

    /* renamed from: a */
    public final boolean mo15169a(Menu menu) {
        menu.add(0, 1, 0, "Submit Feedback").setIcon((int) C0126R.C0127drawable.quantum_ic_send_grey600_24);
        return true;
    }

    /* renamed from: a */
    public final boolean mo15170a(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        Intent a = kyu.m18810a(this.f26159a.getApplicationContext(), this.f26491d.mo14831f().mo15081a());
        if (a == null) {
            Toast.makeText(this.f26159a, "Unable to launch submit feedback activity", 1).show();
        } else {
            this.f26159a.startService(a);
        }
        return true;
    }
}
