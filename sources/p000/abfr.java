package p000;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* renamed from: abfr */
final /* synthetic */ class abfr implements View.OnClickListener {

    /* renamed from: a */
    private final abfu f57364a;

    public abfr(abfu abfu) {
        this.f57364a = abfu;
    }

    public void onClick(View view) {
        abfu abfu = this.f57364a;
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            EditText editText = abfu.f57368a.f78973t.f111270i;
            Editable text = editText.getText();
            editText.setText(tag.toString());
            editText.setSelection(editText.getText().length());
            abcx.m47483a(abfu.f57368a, text);
        }
    }
}
