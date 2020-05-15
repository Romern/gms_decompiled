package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: aqto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqto {
    public aqto(Context context, BaseCardView baseCardView, bzjl bzjl, String str, String str2, String str3, tie tie, tim tim) {
        BaseCardView baseCardView2 = baseCardView;
        bzjl bzjl2 = bzjl;
        if (bzjl2.f170306a.size() != 0) {
            baseCardView2.mo59007a((int) C0126R.string.profile_photos_title);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.nested_photos_entry, (ViewGroup) null);
            int childCount = viewGroup.getChildCount();
            int i = 340;
            int i2 = 0;
            while (i2 < bzjl2.f170306a.size() && i2 < childCount) {
                bzjk bzjk = (bzjk) bzjl2.f170306a.get(i2);
                if (!bzjk.f170302a.isEmpty()) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i2);
                    viewGroup2.setVisibility(0);
                    tie.mo26557a(bzjk.f170302a, i, new aqtm(viewGroup2));
                    viewGroup2.findViewById(C0126R.C0129id.text).setVisibility(8);
                    viewGroup2.findViewById(C0126R.C0129id.subtext).setVisibility(8);
                    i++;
                }
                i2++;
            }
            baseCardView2.mo59009a(viewGroup);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(cgor.f187408a.mo6606a().mo84195d(), str3)));
            aqqk.m71973a(context, intent, str, str2);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                baseCardView2.mo59008a((int) C0126R.string.photos_see_all, (int) C0126R.C0127drawable.quantum_ic_google_vd_theme_24, new aqtn(intent, context, tim));
                return;
            }
            return;
        }
        baseCardView2.setVisibility(8);
    }
}
