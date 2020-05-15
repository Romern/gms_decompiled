package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.p037ui.widget.MultiLineLayout;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.LinkedHashMap;

/* renamed from: anrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrs extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public final TextView f77530a;

    /* renamed from: b */
    public final ryw f77531b = new ryw(2097152);

    /* renamed from: c */
    public boolean f77532c;

    /* renamed from: d */
    public Audience f77533d;

    /* renamed from: e */
    public int f77534e;

    /* renamed from: f */
    public boolean f77535f;

    /* renamed from: g */
    private final LayoutInflater f77536g;

    /* renamed from: h */
    private final MultiLineLayout f77537h;

    /* renamed from: i */
    private final View f77538i;

    /* renamed from: j */
    private final LinkedHashMap f77539j = new LinkedHashMap();

    /* renamed from: k */
    private String f77540k;

    /* renamed from: l */
    private final rqm f77541l;

    /* renamed from: m */
    private int f77542m;

    /* renamed from: n */
    private final String f77543n;

    /* renamed from: o */
    private final Context f77544o;

    /* renamed from: p */
    private final rkb f77545p;

    public anrs(Context context, Context context2, rqm rqm) {
        super(context);
        this.f77541l = rqm;
        this.f77544o = context2;
        LayoutInflater from = LayoutInflater.from(context2);
        this.f77536g = from;
        View inflate = from.inflate((int) C0126R.C0128layout.common_audience_view, this);
        this.f77537h = (MultiLineLayout) inflate.findViewById(C0126R.C0129id.audience_view_list);
        this.f77538i = inflate.findViewById(C0126R.C0129id.audience_view_editable);
        this.f77530a = (TextView) inflate.findViewById(C0126R.C0129id.audience_view_text);
        this.f77543n = context2.getString(C0126R.string.plus_sharebox_audience_view_name_separator);
        rjy rjy = new rjy(context);
        rjo rjo = allr.f73629a;
        allp allp = new allp();
        allp.f73626a = 80;
        rjy.mo24780a(rjo, allp.mo40491a());
        this.f77545p = rjy.mo24784b();
        setOnClickListener(this);
        this.f77538i.setOnClickListener(this);
        setSaveEnabled(true);
    }

    /* renamed from: a */
    public static final void m65071a(Bitmap bitmap, ImageView imageView) {
        imageView.setAlpha(255);
        imageView.setImageBitmap(bitmap);
        imageView.setPadding(0, 0, 0, 0);
    }

    /* renamed from: b */
    public final void mo42162b() {
        for (View view : this.f77539j.values()) {
            m65072a(view, (AudienceMember) view.getTag());
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f77545p.mo24801e();
    }

    public void onClick(View view) {
        try {
            int i = this.f77542m;
            if (i == 2) {
                this.f77541l.mo25032a((AudienceMember) view.getTag());
            } else if (i == 3) {
                this.f77541l.mo25031a();
            }
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f77545p.mo24803g();
        super.onDetachedFromWindow();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        super.onRestoreInstanceState(bundle.getParcelable("parent"));
        this.f77532c = bundle.getBoolean("showEmptyText", false);
        this.f77535f = bundle.getBoolean("underage", false);
        mo42161a((Audience) bundle.getParcelable("audience"));
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putBoolean("showEmptyText", this.f77532c);
        bundle.putBoolean("underage", this.f77535f);
        bundle.putParcelable("audience", this.f77533d);
        return bundle;
    }

    /* renamed from: a */
    private final void m65072a(View view, AudienceMember audienceMember) {
        boolean z;
        anrs anrs;
        String str;
        String str2;
        View findViewById = view.findViewById(C0126R.C0129id.chip_background);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.chip_text);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.chip_icon);
        ImageView imageView2 = (ImageView) view.findViewById(C0126R.C0129id.chip_close);
        int i = 0;
        if (audienceMember == null) {
            z = false;
        } else if (!audienceMember.f30298h.getBoolean("checkboxEnabled", true) || this.f77542m != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = 8;
        }
        imageView2.setVisibility(i);
        if (!z) {
            anrs = null;
        } else {
            anrs = this;
        }
        view.setOnClickListener(anrs);
        view.setClickable(z);
        view.setTag(audienceMember);
        Context context = this.f77544o;
        boolean z2 = this.f77535f;
        int i2 = audienceMember.f30292b;
        int i3 = C0126R.C0127drawable.common_ic_acl_circles;
        int i4 = C0126R.C0127drawable.common_acl_chip_green;
        if (i2 == 1) {
            int i5 = audienceMember.f30293c;
            if (i5 == -1) {
                str = audienceMember.f30296f;
            } else if (i5 == 1) {
                if (z2) {
                    i4 = C0126R.C0127drawable.common_acl_chip_red;
                }
                str = context.getString(C0126R.string.common_chips_label_public);
                i3 = C0126R.C0127drawable.common_ic_acl_public;
            } else if (i5 == 2) {
                str = audienceMember.f30296f;
                i3 = C0126R.C0127drawable.common_ic_acl_domain;
            } else if (i5 == 3) {
                str = context.getString(C0126R.string.common_chips_label_your_circles);
            } else if (i5 == 4) {
                if (z2) {
                    i4 = C0126R.C0127drawable.common_acl_chip_red;
                }
                str = context.getString(C0126R.string.common_chips_label_extended_circles);
                i3 = C0126R.C0127drawable.common_ic_acl_extended;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown circle type: ");
                sb.append(i5);
                throw new IllegalArgumentException(sb.toString());
            }
            i4 = C0126R.C0127drawable.common_acl_chip_blue;
        } else if (i2 == 2) {
            str = audienceMember.f30296f;
            i3 = C0126R.C0127drawable.common_ic_acl_person;
            i4 = C0126R.C0127drawable.common_acl_chip_blue;
        } else {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unknown audience member type: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        anrt anrt = new anrt(i4, str, i3);
        findViewById.setBackgroundResource(anrt.f77546a);
        textView.setText(anrt.f77547b);
        imageView.setAlpha(127);
        imageView.setImageResource(anrt.f77548c);
        if (audienceMember.mo17847c() && (str2 = audienceMember.f30297g) != null) {
            Bitmap bitmap = (Bitmap) this.f77531b.mo15546a(str2);
            if (bitmap != null) {
                m65071a(bitmap, imageView);
            }
            rjo rjo = allr.f73629a;
            amcy.m62630a(this.f77545p, str2, 1, 1).mo9458a(new anrq(this, str2, imageView));
        }
    }

    /* renamed from: a */
    public final void mo42160a() {
        Audience audience = this.f77533d;
        if (audience != null && audience.f30290e) {
            this.f77542m = 1;
            this.f77530a.setVisibility(0);
            this.f77537h.setVisibility(8);
        } else {
            this.f77542m = this.f77534e;
            this.f77530a.setVisibility(8);
            this.f77537h.setVisibility(0);
        }
        int i = this.f77542m;
        if (i == 1) {
            this.f77538i.setVisibility(8);
            setClickable(false);
            setOnClickListener(null);
        } else if (i == 2) {
            this.f77538i.setVisibility(8);
            setClickable(false);
            setOnClickListener(null);
        } else if (i == 3) {
            this.f77538i.setVisibility(0);
            setClickable(true);
            setOnClickListener(this);
        }
        mo42162b();
        invalidate();
    }

    /* renamed from: a */
    public final void mo42161a(Audience audience) {
        this.f77533d = audience;
        this.f77539j.clear();
        this.f77537h.removeAllViews();
        this.f77540k = "";
        if (audience != null && audience.f30287b.size() > 0) {
            for (AudienceMember audienceMember : audience.f30287b) {
                if (audienceMember == null) {
                    throw new IllegalArgumentException("AudienceMember can not be null.");
                } else if (!this.f77539j.containsKey(audienceMember)) {
                    if (this.f77532c && this.f77539j.isEmpty()) {
                        this.f77540k = audienceMember.f30296f;
                        this.f77537h.removeAllViews();
                    } else {
                        String valueOf = String.valueOf(this.f77540k);
                        String str = this.f77543n;
                        String str2 = audienceMember.f30296f;
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(str2).length());
                        sb.append(valueOf);
                        sb.append(str);
                        sb.append(str2);
                        this.f77540k = sb.toString();
                    }
                    View inflate = this.f77536g.inflate((int) C0126R.C0128layout.common_audience_view_chip, (ViewGroup) null);
                    m65072a(inflate, audienceMember);
                    this.f77539j.put(audienceMember, inflate);
                    this.f77537h.addView(inflate);
                    this.f77530a.setText(this.f77540k);
                    invalidate();
                }
            }
        } else if (this.f77532c) {
            this.f77530a.setText((int) C0126R.string.common_chips_label_empty_circles);
        }
        mo42160a();
    }
}
