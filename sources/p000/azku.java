package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azku implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99568a;

    /* renamed from: b */
    private int f99569b;

    public azku(CardChimeraActivity cardChimeraActivity) {
        this.f99568a = cardChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void
     arg types: [android.widget.ImageButton, int]
     candidates:
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, android.graphics.Bitmap):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(boolean, java.lang.String):boolean
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, java.lang.String):void
      azmy.a(java.lang.String, java.lang.String):void
      azdo.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, android.graphics.Bitmap):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(boolean, java.lang.String):boolean
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, java.lang.String):void
      azmy.a(java.lang.String, java.lang.String):void
      azdo.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2 = false;
        if (TextUtils.isEmpty(charSequence)) {
            this.f99568a.f111228l.setMaxLines(1);
            CardChimeraActivity cardChimeraActivity = this.f99568a;
            cardChimeraActivity.mo60405a((View) cardChimeraActivity.f111230n, false);
            CardChimeraActivity cardChimeraActivity2 = this.f99568a;
            cardChimeraActivity2.mo60405a((View) cardChimeraActivity2.f111231o, true);
            this.f99569b = 0;
            return;
        }
        if (this.f99569b != this.f99568a.f111228l.getLineCount()) {
            EditText editText = this.f99568a.f111228l;
            if (editText.getLineCount() > 1) {
                i4 = 4;
            } else {
                i4 = 1;
            }
            editText.setMaxLines(i4);
            this.f99569b = this.f99568a.f111228l.getLineCount();
        }
        int trimmedLength = TextUtils.getTrimmedLength(charSequence);
        CardChimeraActivity cardChimeraActivity3 = this.f99568a;
        ImageButton imageButton = cardChimeraActivity3.f111230n;
        if (!cardChimeraActivity3.f111172D) {
            z = false;
        } else {
            z = trimmedLength > 0;
        }
        cardChimeraActivity3.mo60405a(imageButton, z);
        CardChimeraActivity cardChimeraActivity4 = this.f99568a;
        TextView textView = cardChimeraActivity4.f111231o;
        if (trimmedLength == 0) {
            z2 = true;
        }
        cardChimeraActivity4.mo60405a(textView, z2);
    }
}
