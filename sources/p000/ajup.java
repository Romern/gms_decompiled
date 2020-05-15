package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.p002v7.widget.SwitchCompat;
import android.text.BidiFormatter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: ajup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajup extends ajuj {

    /* renamed from: s */
    public final SwitchCompat f71306s;

    /* renamed from: t */
    final /* synthetic */ ajuq f71307t;

    /* renamed from: u */
    private final LinearLayout f71308u;

    /* renamed from: v */
    private final QuickContactBadge f71309v;

    /* renamed from: w */
    private final TextView f71310w;

    /* renamed from: x */
    private final TextView f71311x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajup(ajuq ajuq, View view) {
        super(view);
        this.f71307t = ajuq;
        this.f71308u = (LinearLayout) view.findViewById(C0126R.C0129id.contact_list_root);
        this.f71310w = (TextView) view.findViewById(C0126R.C0129id.display_name);
        this.f71309v = (QuickContactBadge) view.findViewById(C0126R.C0129id.profile_badge);
        this.f71311x = (TextView) view.findViewById(C0126R.C0129id.contact_info);
        this.f71306s = (SwitchCompat) view.findViewById(C0126R.C0129id.select_switch);
    }

    /* renamed from: b */
    private final void m59049b(Context context, Contact contact) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(contact.f80844a, contact.f80845b);
        if (lookupUri != null) {
            this.f71309v.assignContactUri(lookupUri);
        }
        this.f71309v.setImageDrawable(new ajwv(context, new ajwu(contact.f80846c, contact.f80847d, true), ajwv.m59160a(context)));
        this.f71309v.setContentDescription(contact.f80846c);
        this.f71309v.setOverlay(new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38926a(Context context, Contact contact) {
        this.f71310w.setText(contact.f80846c);
        this.f71311x.setText(BidiFormatter.getInstance().unicodeWrap(contact.f80849f.f80857b));
        m59049b(context, contact);
        this.f71308u.setOnTouchListener(new ajun(this));
        ajuq ajuq = this.f71307t;
        if (!ajuq.f71313d) {
            this.f71306s.setVisibility(8);
        } else {
            this.f71306s.setChecked(ajuq.mo38940a(contact));
            this.f71306s.setVisibility(0);
            this.f71306s.setOnClickListener(new ajuo(this, contact));
        }
        m59049b(context, contact);
    }
}
