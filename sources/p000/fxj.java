package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxj extends fxg {

    /* renamed from: i */
    private static final int[][] f17505i;

    /* renamed from: j */
    private static final int[] f17506j;

    /* renamed from: k */
    private static final int[] f17507k;

    /* renamed from: l */
    private static final int[] f17508l;

    /* renamed from: m */
    private static final int[] f17509m;

    /* renamed from: n */
    private static ColorStateList f17510n;

    /* renamed from: o */
    private static ColorStateList f17511o;

    /* renamed from: p */
    private static ColorStateList f17512p;

    /* renamed from: q */
    private static ColorStateList f17513q;

    /* renamed from: e */
    public final ArrayList f17514e = new ArrayList();

    /* renamed from: f */
    public int f17515f = -1;

    /* renamed from: g */
    private final SparseIntArray f17516g = new SparseIntArray();

    /* renamed from: h */
    private final ArrayList f17517h = new ArrayList();

    static {
        int[][] iArr = {new int[]{16842913}, new int[0]};
        f17505i = iArr;
        f17506j = new int[iArr.length];
        f17507k = new int[iArr.length];
        f17508l = new int[iArr.length];
        f17509m = new int[iArr.length];
    }

    public fxj() {
        mo170a(true);
    }

    /* renamed from: a */
    private static ColorStateList m12623a(ColorStateList colorStateList, int[] iArr, int i) {
        if (iArr[0] == i && colorStateList != null) {
            return colorStateList;
        }
        iArr[0] = i;
        return new ColorStateList(f17505i, iArr);
    }

    /* renamed from: c */
    private final int m12625c(ViewGroup viewGroup, int i) {
        int a = mo162a(i);
        int i2 = this.f17516g.get(a, -1);
        if (i2 >= 0) {
            return i2;
        }
        acm a2 = mo163a(viewGroup, a);
        if (a2.mo323d() == -1) {
            a2.f201a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredHeight = a2.f201a.getMeasuredHeight();
        this.f17516g.put(a, measuredHeight);
        return measuredHeight;
    }

    /* renamed from: e */
    private final int m12626e(int i, int i2) {
        return i2 - mo11483i(i);
    }

    /* renamed from: j */
    private static int m12627j(int i) {
        return C1165lm.m19352a(i, -1, 0.3f);
    }

    /* renamed from: k */
    private final int m12628k(int i) {
        int i2 = 0;
        for (int i3 = 1; i3 < this.f17514e.size(); i3++) {
            int i4 = i3 - 1;
            i2 += ((fxg) this.f17514e.get(i4)).mo161a();
            if (i < i2) {
                return i4;
            }
        }
        return this.f17514e.size() - 1;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        int k = m12628k(i);
        return (((long) k) << 32) | (((fxg) this.f17514e.get(k)).mo157L(m12626e(k, i)) & 4294967295L);
    }

    /* renamed from: b */
    public final void mo11476b(RecyclerView recyclerView) {
        if (this.f17517h.size() != mo161a()) {
            mo11477c(recyclerView);
        }
    }

    /* renamed from: d */
    public final void mo11464d() {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11464d();
        }
    }

    /* renamed from: f */
    public final int mo11468f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17514e.size(); i2++) {
            i += ((fxg) this.f17514e.get(i2)).mo11468f();
        }
        return i;
    }

    /* renamed from: g */
    public final int mo11478g() {
        int i = this.f17515f;
        if (i >= 0) {
            return mo11483i(i);
        }
        return Integer.MAX_VALUE;
    }

    public final int getPositionForSection(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f17514e.size()) {
            int f = ((fxg) this.f17514e.get(i2)).mo11468f() + i3;
            if (i < f) {
                return mo11483i(i2) + ((fxg) this.f17514e.get(i2)).getPositionForSection(i - i3);
            }
            i2++;
            i3 = f;
        }
        return 0;
    }

    public final int getSectionForPosition(int i) {
        int k = m12628k(i);
        int i2 = 0;
        for (int i3 = 0; i3 < k; i3++) {
            i2 += ((fxg) this.f17514e.get(i3)).mo11468f();
        }
        return i2 + ((fxg) this.f17514e.get(k)).getSectionForPosition(i - mo11483i(k));
    }

    public final Object[] getSections() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f17514e.size(); i++) {
            fxg fxg = (fxg) this.f17514e.get(i);
            if (fxg.mo11468f() > 0) {
                arrayList.addAll(Arrays.asList(fxg.getSections()));
            }
        }
        return arrayList.toArray();
    }

    /* renamed from: h */
    public final int mo11482h(int i) {
        return ((Integer) this.f17517h.get(i)).intValue();
    }

    /* renamed from: i */
    public final int mo11483i(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((fxg) this.f17514e.get(i3)).mo161a();
        }
        return i2;
    }

    /* renamed from: a */
    static void m12624a(rkb rkb, allg allg, fym fym, ContactPerson contactPerson, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        int i4;
        boolean z6;
        int i5;
        String str4;
        int i6;
        int i7;
        Drawable drawable;
        int i8;
        int i9;
        String str5;
        String str6;
        int i10;
        Drawable drawable2;
        fym fym2 = fym;
        ContactPerson contactPerson2 = contactPerson;
        SparseIntArray sparseIntArray3 = sparseIntArray;
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        int i11 = fym2.f206f;
        int j = !z2 ? i : m12627j(i);
        Context context = fym2.f201a.getContext();
        Resources resources = fym2.f201a.getResources();
        ContactPerson.ContactMethod a = contactPerson.mo7263a();
        String a2 = fzm.m12789a(context, contactPerson2);
        if (a2 == null) {
            str = "";
        } else {
            str = a2;
        }
        TextView textView = fym2.f17634z;
        textView.setText(a2);
        TextView textView2 = fym2.f17623A;
        if (!z || textView2 == null) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            textView.setVisibility(0);
            if (z2) {
                f17507k[1] = m12627j(resources.getColor(C0126R.color.appinvite_dark_black));
                ColorStateList a3 = m12623a(f17511o, f17507k, j);
                f17511o = a3;
                textView.setTextColor(a3);
            } else {
                f17506j[1] = resources.getColor(C0126R.color.appinvite_dark_black);
                ColorStateList a4 = m12623a(f17510n, f17506j, j);
                f17510n = a4;
                textView.setTextColor(a4);
            }
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(a2);
        }
        AvatarReferenceImageView avatarReferenceImageView = fym2.f17630v;
        avatarReferenceImageView.mo46477a(a2);
        AvatarReferenceImageView avatarReferenceImageView2 = avatarReferenceImageView;
        String str7 = a2;
        TextView textView3 = textView;
        String str8 = str;
        fzj.m12781a(rkb, allg, avatarReferenceImageView2, contactPerson, a, z3);
        if (i11 != C0126R.C0128layout.appinvite_contextual_selection_list_item) {
            View view = fym2.f17629u;
            if (view != null) {
                if (z) {
                    drawable2 = fzs.m12827a(context, C0126R.C0127drawable.appinvite_avatar_highlight, j, false);
                } else {
                    drawable2 = null;
                }
                view.setBackgroundDrawable(drawable2);
            }
        } else {
            if (!z) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            avatarReferenceImageView2.setVisibility(i10);
        }
        if (a == null) {
            i5 = 0;
            z6 = false;
            i4 = 1;
            i3 = 0;
            i2 = 0;
            str3 = null;
            str2 = null;
        } else {
            int i12 = a.f9755a;
            if (i12 != 0) {
                i4 = 1;
                if (i12 == 1) {
                    str6 = a.f9756b;
                    i3 = C0126R.C0127drawable.appinvite_ic_email_black_36_crop;
                    i2 = C0126R.C0127drawable.quantum_ic_email_black_36;
                    str5 = null;
                    i9 = C0126R.string.appinvite_contextual_selection_content_description_email;
                } else if (i12 != 2) {
                    str6 = null;
                    i3 = 0;
                    i2 = 0;
                    str5 = null;
                    i9 = 0;
                } else {
                    str6 = a.f9756b;
                    String formatNumber = PhoneNumberUtils.formatNumber(str6);
                    i2 = C0126R.C0127drawable.quantum_ic_message_black_36;
                    i9 = C0126R.string.appinvite_contextual_selection_content_description_sms;
                    str5 = formatNumber;
                    i3 = C0126R.C0127drawable.appinvite_ic_message_black_36_crop;
                }
            } else {
                i4 = 1;
                i3 = C0126R.C0127drawable.appinvite_ic_notifications_black_36_crop;
                str6 = null;
                i2 = C0126R.C0127drawable.quantum_ic_notifications_black_36;
                str5 = null;
                i9 = 0;
            }
            if (sparseIntArray3 == null) {
                str3 = str6;
                str2 = str5;
                i5 = i9;
                z6 = false;
            } else if (sparseIntArray3.indexOfKey(a.f9755a) < 0) {
                str3 = str6;
                str2 = str5;
                i5 = i9;
                z6 = false;
            } else {
                int i13 = sparseIntArray3.get(a.f9755a);
                if (sparseIntArray4 != null) {
                    i3 = sparseIntArray4.get(a.f9755a);
                }
                i2 = i13;
                str3 = str6;
                str2 = str5;
                i5 = i9;
                z6 = true;
            }
        }
        View view2 = fym2.f17631w;
        if (view2 != null) {
            if (z) {
                view2.setVisibility(0);
                view2.setBackgroundResource(C0126R.C0127drawable.appinvite_contextual_selection_check_background);
                ImageView imageView = fym2.f17632x;
                if (imageView != null) {
                    if (i11 == C0126R.C0128layout.appinvite_contextual_selection_grid_item && !z5) {
                        Drawable a5 = fzs.m12827a(context, i2, resources.getColor(C0126R.color.material_grey_white_1000), z6);
                        if (a5 == null) {
                            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_check_white_48);
                        } else {
                            imageView.setImageDrawable(a5);
                        }
                    } else {
                        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_check_white_48);
                    }
                }
            } else {
                view2.setVisibility(8);
            }
        }
        View view3 = fym2.f17626D;
        if (view3 != null) {
            view3.setVisibility(!z2 ? 8 : 0);
        }
        TextView textView4 = fym2.f17627E;
        if (textView4 != null) {
            textView4.setText(str3);
            if (!TextUtils.isEmpty(str3)) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            textView4.setVisibility(i8);
            if (z2) {
                f17509m[i4] = m12627j(resources.getColor(C0126R.color.appinvite_medium_black));
                ColorStateList a6 = m12623a(f17513q, f17509m, j);
                f17513q = a6;
                textView4.setTextColor(a6);
            } else {
                f17508l[i4] = resources.getColor(C0126R.color.appinvite_medium_black);
                ColorStateList a7 = m12623a(f17512p, f17508l, j);
                f17512p = a7;
                textView4.setTextColor(a7);
            }
        }
        if (!z) {
            j = z2 ? m12627j(resources.getColor(C0126R.color.material_grey_600)) : resources.getColor(C0126R.color.material_grey_600);
        }
        ImageView imageView2 = fym2.f17633y;
        if (imageView2 == null) {
            if (!z5) {
                drawable = fzs.m12827a(context, i2, j, z6);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.appinvite_chip_method);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
            int i14 = Build.VERSION.SDK_INT;
            textView3.setCompoundDrawablesRelative(null, null, drawable, null);
        } else {
            Drawable drawable3 = null;
            if (!z5) {
                drawable3 = fzs.m12827a(context, i3, j, z6);
            }
            imageView2.setImageDrawable(drawable3);
            if (i11 == C0126R.C0128layout.appinvite_contextual_selection_grid_item) {
                if (z) {
                    i7 = 8;
                } else {
                    i7 = drawable3 != null ? 0 : 8;
                }
                imageView2.setVisibility(i7);
            }
        }
        if (i5 != 0) {
            String string = resources.getString(i5);
            StringBuilder sb = new StringBuilder(str8.length() + i4 + String.valueOf(string).length());
            sb.append(str8);
            sb.append(" ");
            sb.append(string);
            str4 = sb.toString();
        } else {
            str4 = str8;
        }
        ImageView imageView3 = fym2.f17625C;
        if (imageView3 == null) {
            i6 = 0;
        } else {
            int i15 = 4;
            if (z4 && contactPerson2.f9753e.size() > i4) {
                i15 = 0;
            }
            imageView3.setVisibility(i15);
            i6 = 0;
            imageView3.setImageDrawable(fzs.m12827a(context, C0126R.C0127drawable.quantum_ic_arrow_drop_down_black_18, j, false));
        }
        View view4 = fym2.f17624B;
        if (view4 != null) {
            if (z5 || contactPerson2.f9753e.size() == 0) {
                i6 = 8;
            }
            view4.setVisibility(i6);
            String string2 = resources.getString(C0126R.string.appinvite_contact_method_selector_description);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 2 + String.valueOf(string2).length());
            sb2.append(str7);
            sb2.append(", ");
            sb2.append(string2);
            view4.setContentDescription(sb2.toString());
        }
        if (fym2.f17628t != null) {
            if (str2 != null) {
                String valueOf = String.valueOf(str4);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + i4 + String.valueOf(str2).length());
                sb3.append(valueOf);
                sb3.append(" ");
                sb3.append(str2);
                str4 = sb3.toString();
            } else if (str3 != null) {
                String valueOf2 = String.valueOf(str4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + i4 + String.valueOf(str3).length());
                sb4.append(valueOf2);
                sb4.append(" ");
                sb4.append(str3);
                str4 = sb4.toString();
            }
            fym2.f17628t.setContentDescription(str4);
        }
    }

    /* renamed from: b */
    public final void mo11458b(ContactPerson contactPerson) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11458b(contactPerson);
        }
    }

    /* renamed from: d */
    public final void mo11465d(boolean z) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11465d(z);
        }
    }

    /* renamed from: e */
    public final CharSequence mo11466e() {
        for (int i = 0; i < this.f17514e.size(); i++) {
            CharSequence e = ((fxg) this.f17514e.get(i)).mo11466e();
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final int mo11471g(int i) {
        int k = m12628k(i);
        return ((fxg) this.f17514e.get(k)).mo11471g(m12626e(k, i));
    }

    /* renamed from: b */
    public final void mo11459b(CharSequence charSequence) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11459b(charSequence);
        }
    }

    /* renamed from: e */
    public final void mo11467e(boolean z) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11467e(z);
        }
    }

    /* renamed from: g */
    public final void mo11472g(boolean z) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11470f(z);
        }
    }

    /* renamed from: b */
    public final void mo11460b(boolean z) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11460b(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11461c() {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11469f(this.f17498d);
        }
    }

    /* renamed from: c */
    public final void mo11477c(RecyclerView recyclerView) {
        this.f17517h.clear();
        int i = 0;
        if (recyclerView.getLayoutManager() instanceof aab) {
            aab aab = (aab) recyclerView.getLayoutManager();
            aaa aaa = aab.f9g;
            int i2 = aab.f4b;
            int i3 = 0;
            while (i < mo161a()) {
                if (aaa.mo9a(i, i2) == 0) {
                    i3 += m12625c(recyclerView, i);
                }
                this.f17517h.add(Integer.valueOf(i3));
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i < mo161a()) {
            i4 += m12625c(recyclerView, i);
            this.f17517h.add(Integer.valueOf(i4));
            i++;
        }
    }

    /* renamed from: c */
    public final void mo11462c(CharSequence charSequence) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11462c(charSequence);
        }
    }

    /* renamed from: c */
    public final void mo11463c(boolean z) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11463c(z);
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17514e.size(); i2++) {
            i += ((fxg) this.f17514e.get(i2)).mo161a();
        }
        return i;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        int k = m12628k(i);
        return ((fxg) this.f17514e.get(k)).mo162a(m12626e(k, i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i == C0126R.C0128layout.appinvite_contextual_selection_recipients) {
            return new fyp(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_chip) {
            return new fyl(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_search) {
            return new fyo(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_header_text || i == C0126R.C0128layout.appinvite_contextual_selection_sub_header_text) {
            return new fyq(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_grid_item || i == C0126R.C0128layout.appinvite_contextual_selection_list_item) {
            return new fym(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_anchor) {
            return new acm(inflate);
        }
        for (int i2 = 0; i2 < this.f17514e.size(); i2++) {
            acm a = ((fxg) this.f17514e.get(i2)).mo163a(viewGroup, i);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo167a(acm acm) {
        AvatarReferenceImageView avatarReferenceImageView;
        if ((acm instanceof fym) && (avatarReferenceImageView = ((fym) acm).f17630v) != null) {
            avatarReferenceImageView.mo46475a();
        }
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        int k = m12628k(i);
        ((fxg) this.f17514e.get(k)).mo168a(acm, m12626e(k, i));
    }

    /* renamed from: a */
    public final void mo11455a(ContactPerson contactPerson) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11455a(contactPerson);
        }
    }

    /* renamed from: a */
    public final void mo11456a(ContactPerson contactPerson, int i) {
        for (int i2 = 0; i2 < this.f17514e.size(); i2++) {
            ((fxg) this.f17514e.get(i2)).mo11456a(contactPerson, i);
        }
    }

    /* renamed from: a */
    public final void mo11457a(CharSequence charSequence) {
        for (int i = 0; i < this.f17514e.size(); i++) {
            ((fxg) this.f17514e.get(i)).mo11457a(charSequence);
        }
    }
}
