package p000;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvw extends BaseAdapter {

    /* renamed from: a */
    public ContactPerson f17390a;

    /* renamed from: b */
    public boolean f17391b;

    /* renamed from: c */
    public int f17392c;

    /* renamed from: d */
    private final Context f17393d;

    /* renamed from: e */
    private final View.OnClickListener f17394e;

    /* renamed from: f */
    private final List f17395f = new ArrayList();

    /* renamed from: g */
    private final SparseIntArray f17396g;

    /* renamed from: h */
    private int f17397h;

    public fvw(Context context, SparseIntArray sparseIntArray, View.OnClickListener onClickListener) {
        this.f17393d = context;
        this.f17396g = sparseIntArray;
        this.f17394e = onClickListener;
    }

    /* renamed from: a */
    public final ContactPerson.ContactMethod getItem(int i) {
        if (this.f17390a == null || i <= 0) {
            return null;
        }
        return (ContactPerson.ContactMethod) this.f17395f.get(i - 1);
    }

    public final int getCount() {
        if (this.f17390a != null) {
            return this.f17395f.size() + 1;
        }
        return 0;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ContactPerson.ContactMethod contactMethod;
        int i2;
        int i3 = 0;
        if (view == null) {
            view = LayoutInflater.from(this.f17393d).inflate((int) C0126R.C0128layout.appinvite_contextual_selection_dropdown_item, viewGroup, false);
        }
        Resources resources = this.f17393d.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.appinvite_method_padding_medium);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0126R.dimen.appinvite_method_padding_large);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.name);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.avatar_method);
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.contact_detail);
        View findViewById = view.findViewById(C0126R.C0129id.delete_icon);
        int i4 = 8;
        if (i == 0) {
            contactMethod = this.f17390a.mo7263a();
            textView.setText(fzm.m12789a(this.f17393d, this.f17390a));
            textView.setVisibility(0);
            textView2.setTextColor(-1);
            textView2.setPadding(0, 0, 0, dimensionPixelSize);
            if (this.f17397h == 0) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(this.f17394e);
            } else {
                findViewById.setVisibility(8);
            }
            view.setBackgroundColor(this.f17392c);
        } else {
            textView.setVisibility(8);
            textView2.setTextColor(resources.getColor(C0126R.color.appinvite_medium_black));
            textView2.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
            findViewById.setVisibility(8);
            view.setBackgroundColor(0);
            contactMethod = (ContactPerson.ContactMethod) this.f17395f.get(i - 1);
        }
        String a = fzj.m12780a(this.f17393d, contactMethod);
        textView2.setText(a);
        if (!TextUtils.isEmpty(a)) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        boolean z = true;
        if (contactMethod == null) {
            z = false;
        } else {
            int i5 = contactMethod.f9755a;
            if (i5 == 0) {
                i2 = C0126R.C0127drawable.quantum_ic_notifications_black_36;
            } else if (i5 == 1) {
                String string = resources.getString(C0126R.string.appinvite_contextual_selection_content_description_email);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(a).length());
                sb.append(string);
                sb.append(" ");
                sb.append(a);
                a = sb.toString();
                i2 = C0126R.C0127drawable.quantum_ic_email_black_36;
            } else if (i5 != 2) {
                i2 = 0;
            } else {
                String string2 = resources.getString(C0126R.string.appinvite_contextual_selection_content_description_sms);
                String formatNumber = PhoneNumberUtils.formatNumber(a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 1 + String.valueOf(formatNumber).length());
                sb2.append(string2);
                sb2.append(" ");
                sb2.append(formatNumber);
                a = sb2.toString();
                i2 = C0126R.C0127drawable.quantum_ic_message_black_36;
            }
            if (a != null) {
                String valueOf = String.valueOf(a);
                String string3 = i == 0 ? resources.getString(C0126R.string.appinvite_recipient_selected) : resources.getString(C0126R.string.appinvite_recipient_not_selected);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(string3).length());
                sb3.append(valueOf);
                sb3.append(", ");
                sb3.append(string3);
                a = sb3.toString();
            }
            SparseIntArray sparseIntArray = this.f17396g;
            if (sparseIntArray == null) {
                i3 = i2;
                z = false;
            } else if (sparseIntArray.indexOfKey(contactMethod.f9755a) < 0 || this.f17396g.get(contactMethod.f9755a) == 0) {
                i3 = i2;
                z = false;
            } else {
                i3 = this.f17396g.get(contactMethod.f9755a);
            }
        }
        imageView.setImageDrawable(fzs.m12827a(this.f17393d, i3, resources.getColor(C0126R.color.material_grey_600), z));
        textView2.setContentDescription(a);
        return view;
    }

    /* renamed from: a */
    public final void mo11407a(ContactPerson contactPerson, int i) {
        this.f17390a = contactPerson;
        this.f17397h = i;
        this.f17395f.clear();
        if (this.f17391b) {
            this.f17395f.addAll(this.f17390a.f9753e);
            this.f17395f.remove(this.f17390a.mo7263a());
        }
        notifyDataSetChanged();
    }
}
