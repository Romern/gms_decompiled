package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* renamed from: vnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnv extends vnt {

    /* renamed from: b */
    private static final int[] f49601b = {C0126R.string.common_today, C0126R.string.common_yesterday, C0126R.string.drive_time_range_this_week, C0126R.string.drive_time_range_this_month, C0126R.string.drive_time_range_this_year, C0126R.string.drive_time_range_last_year, C0126R.string.drive_time_range_older};

    /* renamed from: c */
    private final uwc f49602c;

    /* renamed from: d */
    private final vod f49603d;

    public vnv(String str, int i, boolean z, uwc uwc, vod vod) {
        super(str, i, z);
        this.f49602c = uwc;
        this.f49603d = vod;
    }

    /* renamed from: a */
    public final vnz mo28676a(txb txb, Context context) {
        int i;
        txb txb2 = txb;
        Context context2 = context;
        ArrayList arrayList = new ArrayList();
        vnu vnu = new vnu(Calendar.getInstance());
        int i2 = 0;
        long[] jArr = {vnu.f49595b, vnu.f49596c, vnu.f49597d, vnu.f49598e, vnu.f49599f, vnu.f49600g, 0};
        if (this.f49591a) {
            i = m40895a(txb);
            arrayList.add(new vnx(context2.getString(C0126R.string.drive_fast_scroll_title_grouper_collections), i));
        } else {
            i = 0;
        }
        while (i2 < f49601b.length) {
            long j = jArr[i2];
            int a = txb.mo24660a();
            int i3 = i;
            while (a > i3) {
                int i4 = (a + i3) / 2;
                Date date = (Date) txb2.mo24661a(i4).mo26855a(this.f49602c);
                if ((date != null ? date.getTime() : 0) >= j) {
                    i3 = i4 + 1;
                } else {
                    a = i4;
                }
            }
            arrayList.add(new vnx(context2.getString(f49601b[i2]), i3 - i));
            i2++;
            i = i3;
        }
        return new vnz(arrayList, arrayList, txb2);
    }

    /* renamed from: a */
    public final voe mo28677a(Context context) {
        return this.f49603d.mo28686a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28673a(vge vge) {
        vge.f49229a.add(new FieldWithSortOrder(((uvt) this.f49602c).f48653a, false));
    }
}
