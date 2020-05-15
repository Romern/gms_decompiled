package com.google.android.gms.contactsheet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HeaderAvatarView extends FrameLayout {
    public HeaderAvatarView(Context context) {
        super(context);
        m22840a();
    }

    /* renamed from: a */
    private final void m22840a() {
        inflate(getContext(), C0126R.C0128layout.header_avatar, this);
    }

    public HeaderAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22840a();
    }
}
