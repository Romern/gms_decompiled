package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import java.util.List;

/* renamed from: tfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tfv implements C0038ax {

    /* renamed from: a */
    public boolean f45888a;

    /* renamed from: b */
    public final ExpandableLinearLayout f45889b;

    /* renamed from: c */
    public final ExpandableLinearLayout f45890c;

    /* renamed from: d */
    public final CardButton f45891d;

    /* renamed from: e */
    public final tim f45892e;

    /* renamed from: f */
    private final TextView f45893f;

    /* renamed from: g */
    private final TextView f45894g;

    /* renamed from: h */
    private final View f45895h;

    public tfv(View view, tim tim) {
        this.f45895h = view;
        this.f45892e = tim;
        CardButton cardButton = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45891d = cardButton;
        cardButton.setOnClickListener(new tfu(this));
        this.f45893f = (TextView) view.findViewById(C0126R.C0129id.education_title);
        this.f45894g = (TextView) view.findViewById(C0126R.C0129id.employment_title);
        this.f45889b = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.education);
        this.f45890c = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.employment);
        view.setVisibility(8);
    }

    /* renamed from: a */
    private final void m36921a(ExpandableLinearLayout expandableLinearLayout, List list, Drawable drawable) {
        bmxv bmxv;
        bmxv bmxv2;
        for (int i = 0; i < list.size(); i++) {
            bzjs bzjs = (bzjs) list.get(i);
            if (bzjs.f170338c.isEmpty() || bzjs.f170336a.isEmpty()) {
                bmxv = !bzjs.f170338c.isEmpty() ? bmxv.m108566b(bzjs.f170338c) : !bzjs.f170336a.isEmpty() ? bmxv.m108566b(bzjs.f170336a) : bmvz.f131120a;
            } else {
                bmxv = bmxv.m108566b(this.f45895h.getContext().getString(C0126R.string.profile_employment_current_details, bzjs.f170338c, bzjs.f170336a));
            }
            if (bmxv.mo66813a()) {
                thb a = thb.m36953a();
                a.f45998a = (String) bmxv.mo66814b();
                if (!bzjs.f170343h) {
                    bzru bzru = bzjs.f170340e;
                    if (bzru == null) {
                        bzru = bzru.f171201d;
                    }
                    if (bzru.f171203a != 0) {
                        bzru bzru2 = bzjs.f170342g;
                        if (bzru2 == null) {
                            bzru2 = bzru.f171201d;
                        }
                        if (bzru2.f171203a != 0) {
                            Context context = this.f45895h.getContext();
                            Object[] objArr = new Object[2];
                            bzru bzru3 = bzjs.f170340e;
                            if (bzru3 == null) {
                                bzru3 = bzru.f171201d;
                            }
                            objArr[0] = Integer.valueOf(bzru3.f171203a);
                            bzru bzru4 = bzjs.f170342g;
                            if (bzru4 == null) {
                                bzru4 = bzru.f171201d;
                            }
                            objArr[1] = Integer.valueOf(bzru4.f171203a);
                            bmxv2 = bmxv.m108566b(context.getString(C0126R.string.organizations_start_to_end, objArr));
                        }
                    }
                    bzru bzru5 = bzjs.f170340e;
                    if (bzru5 == null) {
                        bzru5 = bzru.f171201d;
                    }
                    if (bzru5.f171203a == 0) {
                        bzru bzru6 = bzjs.f170342g;
                        if (bzru6 == null) {
                            bzru6 = bzru.f171201d;
                        }
                        if (bzru6.f171203a == 0) {
                            bmxv2 = bmvz.f131120a;
                        } else {
                            bzru bzru7 = bzjs.f170342g;
                            if (bzru7 == null) {
                                bzru7 = bzru.f171201d;
                            }
                            bmxv2 = bmxv.m108566b(String.valueOf(bzru7.f171203a));
                        }
                    } else {
                        bzru bzru8 = bzjs.f170340e;
                        if (bzru8 == null) {
                            bzru8 = bzru.f171201d;
                        }
                        bmxv2 = bmxv.m108566b(String.valueOf(bzru8.f171203a));
                    }
                } else {
                    bzru bzru9 = bzjs.f170340e;
                    if (bzru9 == null) {
                        bzru9 = bzru.f171201d;
                    }
                    if (bzru9.f171203a != 0) {
                        Context context2 = this.f45895h.getContext();
                        Object[] objArr2 = new Object[1];
                        bzru bzru10 = bzjs.f170340e;
                        if (bzru10 == null) {
                            bzru10 = bzru.f171201d;
                        }
                        objArr2[0] = Integer.valueOf(bzru10.f171203a);
                        bmxv2 = bmxv.m108566b(context2.getString(C0126R.string.organizations_start_to_present, objArr2));
                    } else {
                        bmxv2 = bmxv.m108566b(this.f45895h.getContext().getString(C0126R.string.organizations_present));
                    }
                }
                if (bmxv2.mo66813a()) {
                    a.f45999b = (String) bmxv2.mo66814b();
                }
                if (expandableLinearLayout.getChildCount() == 0) {
                    a.f46001d = drawable;
                } else {
                    a.mo26507b();
                }
                expandableLinearLayout.addView(a.mo26505a(this.f45895h.getContext(), expandableLinearLayout));
            }
        }
    }

    /* renamed from: a */
    public final void mo26478a() {
        this.f45888a = false;
        this.f45891d.mo17998a();
        this.f45889b.mo18006a(1);
        this.f45890c.mo18006a(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        boolean z;
        this.f45889b.removeAllViews();
        this.f45890c.removeAllViews();
        this.f45889b.setVisibility(8);
        this.f45893f.setVisibility(8);
        this.f45890c.setVisibility(8);
        this.f45894g.setVisibility(8);
        this.f45891d.setVisibility(8);
        this.f45895h.setVisibility(8);
        if (bmxv.mo66813a()) {
            bzjt bzjt = (bzjt) bmxv.mo66814b();
            if (!bzjt.f170347a.isEmpty()) {
                m36921a(this.f45890c, bzjt.f170347a, C1391tv.m20459b(this.f45895h.getContext(), C0126R.C0127drawable.quantum_gm_ic_work_outline_vd_theme_24));
                if (this.f45890c.getChildCount() != 0) {
                    this.f45890c.setVisibility(0);
                    this.f45894g.setVisibility(0);
                    z = true;
                    if (!bzjt.f170348b.isEmpty()) {
                        m36921a(this.f45889b, bzjt.f170348b, C1391tv.m20459b(this.f45895h.getContext(), C0126R.C0127drawable.quantum_gm_ic_school_vd_theme_24));
                        if (this.f45889b.getChildCount() != 0) {
                            this.f45889b.setVisibility(0);
                            this.f45893f.setVisibility(0);
                            this.f45895h.setVisibility(0);
                            if (this.f45890c.getChildCount() <= 1 || this.f45889b.getChildCount() > 1) {
                                this.f45891d.setVisibility(0);
                                mo26478a();
                            }
                            return;
                        }
                    }
                    if (!z) {
                        return;
                    }
                    this.f45895h.setVisibility(0);
                    if (this.f45890c.getChildCount() <= 1) {
                    }
                    this.f45891d.setVisibility(0);
                    mo26478a();
                }
            }
            z = false;
            if (!bzjt.f170348b.isEmpty()) {
            }
            if (!z) {
            }
            this.f45895h.setVisibility(0);
            if (this.f45890c.getChildCount() <= 1) {
            }
            this.f45891d.setVisibility(0);
            mo26478a();
        }
    }
}
