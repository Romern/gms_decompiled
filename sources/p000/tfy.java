package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.identity.accounts.api.AccountData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tfy implements C0038ax {

    /* renamed from: a */
    public final tim f45899a;

    /* renamed from: b */
    public final View f45900b;

    /* renamed from: c */
    private int f45901c;

    /* renamed from: d */
    private final CardButton f45902d;

    /* renamed from: e */
    private final tie f45903e;

    public tfy(View view, tie tie, tim tim) {
        this.f45903e = tie;
        this.f45899a = tim;
        this.f45900b = view;
        this.f45902d = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        this.f45901c = 340;
        ViewGroup viewGroup = (ViewGroup) this.f45900b.findViewById(C0126R.C0129id.photos);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setVisibility(4);
        }
        this.f45900b.setVisibility(8);
        if (bmxv.mo66813a() && ((thu) bmxv.mo66814b()).mo26535a().f170306a.size() != 0) {
            thu thu = (thu) bmxv.mo66814b();
            bxwc bxwc = thu.mo26535a().f170306a;
            ArrayList arrayList = new ArrayList();
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                bzjk bzjk = (bzjk) bxwc.get(i2);
                if (!bzjk.f170302a.isEmpty()) {
                    arrayList.add(bzjk.f170302a);
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f45900b.findViewById(C0126R.C0129id.photos);
            int childCount = viewGroup2.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup2.getChildAt(i3);
                if (i3 < arrayList.size()) {
                    int i4 = this.f45901c;
                    this.f45901c = i4 + 1;
                    this.f45903e.mo26557a((String) arrayList.get(i3), i4, new tfw(childAt));
                }
            }
            this.f45902d.setVisibility(8);
            if (thu.mo26536b().mo66813a() && !TextUtils.isEmpty((CharSequence) thu.mo26536b().mo66814b())) {
                bmxv b = thu.mo26536b();
                bmxv c = thu.mo26537c();
                bmxv d = thu.mo26538d();
                Context context = this.f45900b.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://get.google.com/albumarchive/%s", (String) b.mo66814b())));
                PackageManager packageManager = context.getPackageManager();
                Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (!"com.android.chrome".equals(next.activityInfo.packageName) && !"com.android.browser".equals(next.activityInfo.packageName) && packageManager.checkSignatures("com.google.android.gms", next.activityInfo.packageName) == 0) {
                        intent.setPackage(next.activityInfo.packageName);
                        if (c.mo66813a() && !((String) c.mo66814b()).isEmpty()) {
                            if (!d.mo66813a() || ((String) d.mo66814b()).isEmpty()) {
                                acxv.m49971a(context, intent, AccountData.m66749a((String) c.mo66814b()));
                            } else if (!((String) d.mo66814b()).isEmpty()) {
                                acxv.m49971a(context, intent, AccountData.m66750a((String) c.mo66814b(), (String) d.mo66814b()));
                            }
                        }
                    }
                }
                if (intent.resolveActivity(this.f45900b.getContext().getPackageManager()) != null) {
                    this.f45902d.mo17999a((int) C0126R.string.photos_see_all);
                    this.f45902d.mo18002b(C0126R.C0127drawable.quantum_ic_google_vd_theme_24);
                    this.f45902d.setOnClickListener(new tfx(this, intent));
                    this.f45902d.setVisibility(0);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f45900b.setVisibility(0);
            }
        }
    }
}
