package com.google.android.gms.googlehelp.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.button.MaterialButton;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactOptionsContainer extends LinearLayout {

    /* renamed from: a */
    public static final String f78852a;

    /* renamed from: b */
    public aauw f78853b;

    /* renamed from: c */
    public int f78854c;

    /* renamed from: d */
    public boolean f78855d;

    /* renamed from: e */
    public HelpChimeraActivity f78856e;

    /* renamed from: f */
    public HelpConfig f78857f;

    /* renamed from: g */
    public MaterialButton f78858g;

    static {
        String valueOf = String.valueOf(aauz.class.getSimpleName());
        f78852a = valueOf.length() == 0 ? new String("gH_ContactOptsContainer-") : "gH_ContactOptsContainer-".concat(valueOf);
    }

    public ContactOptionsContainer(Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.googlehelp.contact.ContactOptionsContainer, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public ContactOptionsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gh_contact_options_content, (ViewGroup) this, true);
    }
}
