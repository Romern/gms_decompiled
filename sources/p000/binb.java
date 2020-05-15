package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: binb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class binb extends Fragment implements bimw {

    /* renamed from: a */
    public bine f120957a;

    /* renamed from: b */
    public binc f120958b;

    /* renamed from: c */
    public String f120959c;

    /* renamed from: d */
    public LatLngBounds f120960d;

    /* renamed from: e */
    public Integer f120961e;

    /* renamed from: f */
    public Integer f120962f;

    /* renamed from: g */
    private String f120963g;

    /* renamed from: h */
    private boolean f120964h;

    /* renamed from: i */
    private Intent f120965i;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.f120964h = false;
            if (i2 == -1) {
                aelh a = aepf.m52337a(getActivity(), intent);
                this.f120963g = a.mo8024q().toString();
                binc binc = this.f120958b;
                if (binc == null || this.f120957a == null) {
                    throw new IllegalStateException("onActivityResult called before StateController gave us our dependencies.");
                }
                binc.mo64782a();
                bxvd bxvd = binc.f120966a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bppw bppw = (bppw) bxvd.f164949b;
                bppw bppw2 = bppw.f138664f;
                bppw.f138668c = 3;
                bppw.f138666a |= 64;
                this.f120957a.mo64788a(a);
                return;
            }
            this.f120957a.mo64790b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f120963g = bundle.getString("last_query");
            this.f120964h = bundle.getBoolean("is_activity_open");
            this.f120965i = (Intent) bundle.getParcelable("autocomplete_result");
            this.f120960d = (LatLngBounds) bundle.getParcelable("map_bounds");
        }
        if (!this.f120964h) {
            aepg aepg = new aepg();
            String str = this.f120963g;
            if (str != null) {
                aepg.f63586a.putExtra("initial_query", str);
                this.f120963g = null;
            }
            try {
                Intent a = aepg.mo34414a(getActivity().getContainerActivity());
                Integer num = this.f120961e;
                if (num != null) {
                    a.putExtra("primary_color", num);
                }
                Integer num2 = this.f120962f;
                if (num2 != null) {
                    a.putExtra("primary_color_dark", num2);
                }
                String str2 = this.f120959c;
                if (str2 != null) {
                    a.putExtra("account_name", str2);
                }
                LatLngBounds latLngBounds = this.f120960d;
                if (latLngBounds != null) {
                    a.putExtra("bounds", latLngBounds);
                }
                String a2 = spn.m35852a(getActivity());
                if (!TextUtils.isEmpty(a2)) {
                    a.putExtra("forwarded_app", a2);
                }
                a.putExtra("origin", 3);
                startActivityForResult(a, 1);
                this.f120964h = true;
            } catch (rfv | rfw e) {
                Log.wtf("Places", "Exception whilst starting autocomplete activity", e);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("last_query", this.f120963g);
        bundle.putBoolean("is_activity_open", this.f120964h);
        bundle.putParcelable("autocomplete_result", this.f120965i);
        bundle.putParcelable("map_bounds", this.f120960d);
    }
}
