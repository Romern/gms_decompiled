package p000;

import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: fol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fol implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ fom f17015a;

    public fol(fom fom) {
        this.f17015a = fom;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        long j2;
        long j3;
        if (i != -1) {
            long longValue = smh.m35658c(System.currentTimeMillis()).longValue();
            if (i == 1) {
                j3 = -604800000;
            } else if (i != 2) {
                j2 = longValue;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                this.f17015a.f17017b.setText(this.f17015a.getString(C0126R.string.common_network_usage_advanced_range_displayed, simpleDateFormat.format(new Date(j2)), simpleDateFormat.format(new Date(longValue))));
                fom fom = this.f17015a;
                fom.f17016a.f17039a = j2;
                fom.mo11067a();
            } else {
                j3 = -2592000000L;
            }
            j2 = j3 + longValue;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            this.f17015a.f17017b.setText(this.f17015a.getString(C0126R.string.common_network_usage_advanced_range_displayed, simpleDateFormat2.format(new Date(j2)), simpleDateFormat2.format(new Date(longValue))));
            fom fom2 = this.f17015a;
            fom2.f17016a.f17039a = j2;
            fom2.mo11067a();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
