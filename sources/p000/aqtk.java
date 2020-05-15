package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.net.URISyntaxException;

/* renamed from: aqtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqtk implements aqtc, aquo {

    /* renamed from: a */
    public final Context f86764a;

    /* renamed from: b */
    public final tim f86765b;

    /* renamed from: c */
    private final bzia f86766c;

    /* renamed from: d */
    private final tie f86767d;

    /* renamed from: e */
    private int f86768e;

    /* renamed from: f */
    private aqun f86769f;

    /* renamed from: g */
    private aqup f86770g;

    public aqtk(Context context, BaseCardView baseCardView, bzia bzia, int i, tie tie, tim tim, Bundle bundle) {
        ViewGroup viewGroup;
        String str;
        BaseCardView baseCardView2 = baseCardView;
        bzia bzia2 = bzia;
        Bundle bundle2 = bundle;
        this.f86764a = context;
        this.f86766c = bzia2;
        this.f86768e = i;
        this.f86767d = tie;
        this.f86765b = tim;
        Context context2 = this.f86764a;
        aquk aquk = new aquk(context2, 3, C1391tv.m20459b(context2, C0126R.C0127drawable.entry_divider));
        int i2 = 0;
        while (i2 < this.f86766c.f170142b.size() && i2 < 20) {
            bzib bzib = (bzib) this.f86766c.f170142b.get(i2);
            if (!cgoo.f187401a.mo6606a().mo84190e()) {
                viewGroup = (ViewGroup) LayoutInflater.from(this.f86764a).inflate((int) C0126R.C0128layout.generic_card_entry, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) LayoutInflater.from(this.f86764a).inflate((int) C0126R.C0128layout.generic_entry, (ViewGroup) null);
            }
            Intent a = m72066a(bzib.f170150d);
            if (!(a == null || a.resolveActivity(this.f86764a.getPackageManager()) == null)) {
                viewGroup.setOnClickListener(new aqth(this, a));
            }
            m72067a((ImageView) viewGroup.findViewById(C0126R.C0129id.icon), tio.GENERIC_CARD_PRIMARY_ICON, bzib.f170147a, bzib.f170153g, a);
            m72067a((ImageView) viewGroup.findViewById(C0126R.C0129id.alt_icon), tio.GENERIC_CARD_ALTERNATE_ICON, bzib.f170151e, bzib.f170154h, m72066a(bzib.f170152f));
            TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.header);
            if (!bzib.f170148b.isEmpty()) {
                textView.setVisibility(0);
                textView.setText(bzib.f170148b);
            }
            TextView textView2 = (TextView) viewGroup.findViewById(C0126R.C0129id.text);
            if (!bzib.f170149c.isEmpty()) {
                textView2.setVisibility(0);
                textView2.setText(bzib.f170149c);
            }
            if (bzib.f170148b.isEmpty() && bzib.f170147a.isEmpty() && bzib.f170151e.isEmpty()) {
                TextView textView3 = (TextView) viewGroup.findViewById(C0126R.C0129id.text);
                textView3.setTextSize(0, this.f86764a.getResources().getDimension(C0126R.dimen.card_entry_text_size));
                textView3.setTextColor(C1133kh.m17843b(this.f86764a, C0126R.color.card_entry_text_color));
            }
            aquq aquq = new aquq(viewGroup);
            if (!bzib.f170148b.isEmpty() || !bzib.f170149c.isEmpty()) {
                if (!bzib.f170148b.isEmpty()) {
                    str = bzib.f170148b;
                } else {
                    str = bzib.f170149c;
                }
                aquq.mo48164a(str);
            }
            aquk.mo48158a(aquq);
            i2++;
        }
        this.f86769f = aquk;
        if (!bzia2.f170141a.isEmpty()) {
            baseCardView2.mo59010a(bzia2.f170141a);
            if (!bzia2.f170143c.isEmpty()) {
                baseCardView2.findViewById(C0126R.C0129id.title).setContentDescription(bzia2.f170143c);
            }
        }
        this.f86770g = new aqup(baseCardView, this.f86769f, this, bzia2.f170142b.size() > 3, bundle2 != null && bundle2.getBoolean("genericCardExpanded"));
    }

    /* renamed from: a */
    private final Intent m72066a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(this.f86764a.getPackageManager()) != null) {
                return parseUri;
            }
            return null;
        } catch (URISyntaxException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo48140b() {
        this.f86765b.mo26568a(tio.SEE_LESS_BUTTON, tio.GENERIC_CARD);
    }

    /* renamed from: a */
    private final void m72067a(ImageView imageView, tio tio, String str, String str2, Intent intent) {
        if (!TextUtils.isEmpty(str)) {
            tie tie = this.f86767d;
            int i = this.f86768e;
            this.f86768e = i + 1;
            tie.mo26557a(str, i, new aqti(imageView));
        }
        if (!TextUtils.isEmpty(str2)) {
            imageView.setContentDescription(str2);
        }
        if (intent != null && intent.resolveActivity(this.f86764a.getPackageManager()) != null) {
            imageView.setOnClickListener(new aqtj(this, intent, tio));
        }
    }

    /* renamed from: a */
    public final void mo48139a() {
        this.f86765b.mo26568a(tio.SEE_MORE_BUTTON, tio.GENERIC_CARD);
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        bundle.putBoolean("genericCardExpanded", this.f86770g.f86846b);
    }
}
