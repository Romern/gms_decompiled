package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.List;

/* renamed from: biiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biiu extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ biiv f120684a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public biiu(biiv biiv, Context context, List list) {
        super(context, (int) C0126R.C0128layout.places_ui_suggestion_item, list);
        this.f120684a = biiv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.ListView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        biit biit;
        Bitmap bitmap;
        aekw aekw = (aekw) getItem(i);
        if (view == null) {
            view = this.f120684a.getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.places_ui_suggestion_item, (ViewGroup) this.f120684a.f120686b, false);
            biit = new biit();
            biit.f120681b = (ImageView) view.findViewById(C0126R.C0129id.place_suggestion_icon);
            biit.f120682c = (TextView) view.findViewById(C0126R.C0129id.place_suggestion_description);
            biit.f120683d = view.findViewById(C0126R.C0129id.list_divider);
            view.setTag(biit);
        } else {
            biit = (biit) view.getTag();
        }
        biit.f120680a = aekw;
        ImageView imageView = biit.f120681b;
        bihb bihb = this.f120684a.f120690f;
        int c = aekw.mo34281c();
        if (c != 1) {
            bitmap = c != 2 ? c != 5 ? !TextUtils.isEmpty(aekw.mo34282d()) ? bihb.f120586g : bihb.f120584e : bihb.f120585f : bihb.f120583d;
        } else {
            bitmap = bihb.f120582c;
        }
        imageView.setImageBitmap(bitmap);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(aekw.mo34279a());
        for (AutocompletePredictionEntity.SubstringEntity substringEntity : aekw.mo34280b()) {
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(getContext(), C0126R.style.SuggestionHighLightedText);
            int i2 = substringEntity.f79525a;
            spannableStringBuilder.setSpan(textAppearanceSpan, i2, substringEntity.f79526b + i2, 33);
        }
        biit.f120682c.setText(spannableStringBuilder);
        if (i == getCount() - 1) {
            biit.f120683d.setVisibility(8);
        } else {
            biit.f120683d.setVisibility(0);
        }
        return view;
    }
}
