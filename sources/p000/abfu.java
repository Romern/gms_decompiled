package p000;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;
import org.json.JSONException;

/* renamed from: abfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfu extends abh {

    /* renamed from: a */
    public final HelpChimeraActivity f57368a;

    /* renamed from: d */
    public List f57369d;

    public abfu(HelpChimeraActivity helpChimeraActivity) {
        this.f57368a = helpChimeraActivity;
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f57369d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (!aaya.m47229b(ceib.m136897b())) {
            i2 = C0126R.C0128layout.gh_autocomplete_suggestion_item_deprecated;
        } else {
            i2 = C0126R.C0128layout.gh_autocomplete_suggestion_item;
        }
        return new abft(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        int i2;
        abft abft = (abft) acm;
        abfo abfo = (abfo) this.f57369d.get(i);
        int i3 = abfo.f57350a;
        if (i3 == -1) {
            abft.f57367s.setVisibility(8);
            return;
        }
        TextView textView = (TextView) abft.f57367s.findViewById(C0126R.C0129id.gh_suggestion_label);
        String str = abfo.f57351b;
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        Spanned a = aasr.m46941a(str);
        textView.setText(a);
        textView.setContentDescription(a.toString());
        textView.setVisibility(0);
        ImageView imageView = (ImageView) abft.f57367s.findViewById(C0126R.C0129id.gh_article_suggestion_icon);
        ImageView imageView2 = (ImageView) abft.f57367s.findViewById(C0126R.C0129id.gh_query_suggestion_icon);
        ImageView imageView3 = (ImageView) abft.f57367s.findViewById(C0126R.C0129id.gh_query_suggestion_refinement_icon);
        String str2 = abfo.f57353d;
        if (i3 == 1) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_drive_document_googblue_24);
            if (aaya.m47229b(cegu.m136810b())) {
                aayh.m47249a(imageView, this.f57368a, aayi.m47270b() ? aayi.m47263a(this.f57368a, C0126R.attr.gh_primaryBlueColor) : C1133kh.m17843b(this.f57368a, C0126R.color.google_blue600));
            }
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            imageView3.setVisibility(8);
            abft.f57367s.setOnClickListener(new abfp(this, i, str2, abfo));
        } else if (i3 != 2) {
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            if (aaya.m47229b(cegu.m136810b())) {
                aayh.m47249a(imageView2, this.f57368a, aayi.m47270b() ? aayi.m47263a(this.f57368a, C0126R.attr.ghf_greyIconColor) : C1133kh.m17843b(this.f57368a, C0126R.color.google_grey700));
            }
            imageView3.setVisibility(0);
            if (aaya.m47229b(cegu.m136810b())) {
                aayh.m47249a(imageView3, this.f57368a, aayi.m47270b() ? aayi.m47263a(this.f57368a, C0126R.attr.ghf_greyIconColor) : C1133kh.m17843b(this.f57368a, C0126R.color.google_grey700));
            }
            imageView3.setTag(textView.getText());
            imageView3.setOnClickListener(new abfr(this));
            abft.f57367s.setOnClickListener(new abfs(this, abfo));
        } else {
            try {
                String str3 = abfo.f57354e;
                aaso.m46936a(imageView, aasm.m46897b(str3, ""), this.f57368a);
                if (aaya.m47229b(cegu.m136810b())) {
                    HelpChimeraActivity helpChimeraActivity = this.f57368a;
                    if (aayi.m47270b()) {
                        i2 = aayi.m47263a(this.f57368a, C0126R.attr.gh_primaryBlueColor);
                    } else {
                        i2 = C1133kh.m17843b(this.f57368a, C0126R.color.google_blue600);
                    }
                    aayh.m47249a(imageView, helpChimeraActivity, i2);
                }
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                imageView3.setVisibility(8);
                abft.f57367s.setOnClickListener(new abfq(this, str3, str2, i, abfo));
            } catch (JSONException e) {
                abft.f57367s.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo32069a(List list, abfo abfo) {
        abcx.m47486a(this.f57368a, list, abfo);
    }
}
