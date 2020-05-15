package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.HashSet;
import org.json.JSONException;

/* renamed from: abgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgf extends aix implements View.OnClickListener {

    /* renamed from: a */
    public static final String[] f57393a = {"_id", "suggest_format", "suggest_text_1", "suggest_text_2_url", "suggest_intent_query", "help_action_string"};

    /* renamed from: j */
    final aatc f57394j;

    /* renamed from: k */
    private final aasf f57395k;

    /* renamed from: l */
    private final HelpConfig f57396l;

    /* renamed from: m */
    private final bqgj f57397m;

    /* renamed from: n */
    private int f57398n = -1;

    /* renamed from: o */
    private int f57399o = -1;

    /* renamed from: p */
    private int f57400p = -1;

    /* renamed from: q */
    private final abfx f57401q;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aix.<init>(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      aix.<init>(android.content.Context, android.database.Cursor):void
      aix.<init>(android.content.Context, boolean):void */
    public abgf(aasf aasf, abfx abfx, bqgj bqgj) {
        super((Context) aasf, false);
        this.f57395k = aasf;
        this.f57396l = aasf.mo18626g();
        this.f57394j = aasf.mo18629j();
        this.f57401q = abfx;
        this.f57397m = bqgj;
    }

    /* renamed from: a */
    public static String m47661a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            String name = e.getClass().getName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
            sb.append(name);
            sb.append(": ");
            sb.append(message);
            Log.e("gH_SuggestionsAdaptr", sb.toString(), e);
            return null;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            CharSequence b = this.f57401q.mo32073b();
            this.f57401q.mo32072a((CharSequence) tag, false);
            abcx.m47483a(this.f57395k, b);
        }
    }

    /* renamed from: a */
    static final void m47662a(MatrixCursor matrixCursor, int i, abfo abfo) {
        matrixCursor.addRow(new Object[]{Integer.valueOf(i), Integer.valueOf(abfo.f57350a), abfo.f57351b, abfo.f57353d, abfo.f57352c, abfo.f57354e});
    }

    /* renamed from: a */
    public final Cursor mo429a(CharSequence charSequence) {
        Cursor a;
        String charSequence2 = charSequence != null ? charSequence.toString() : "";
        if (this.f57401q.f57374a.getVisibility() != 0 || this.f57401q.f57374a.getWindowVisibility() != 0) {
            return null;
        }
        try {
            MatrixCursor matrixCursor = new MatrixCursor(f57393a);
            boolean isEmpty = TextUtils.isEmpty(charSequence2);
            HashSet hashSet = new HashSet();
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            a = !isEmpty ? this.f57394j.mo31763a(charSequence2) : this.f57394j.mo31762a();
            int columnIndex = a.getColumnIndex("suggest_intent_query");
            int i3 = 0;
            int i4 = 0;
            while (a.moveToNext()) {
                abfo abfo = new abfo(a.getString(columnIndex));
                hashSet.add(abfo);
                int i5 = i4 + 1;
                m47662a(matrixCursor, i4, abfo);
                i4 = i5;
            }
            a.close();
            if (!isEmpty && this.f57396l.mo43233h() && !ssk.m36238b((Context) this.f57395k)) {
                for (abfo abfo2 : abfw.m47634a(((Context) this.f57395k).getApplicationContext(), this.f57396l, this.f57397m, this.f57395k.mo18627h(), charSequence2)) {
                    if (!hashSet.contains(abfo2) && !(abfo2.f57350a == 1 && aasm.m46882a(abfo2.f57353d, aasw.m46952a(), this.f57396l) == null)) {
                        aasf aasf = this.f57395k;
                        aasf.mo18630k();
                        if (abfo2.f57350a == 2) {
                            try {
                                if (!new aasq((Context) aasf).mo31746a(aasm.m46897b(abfo2.f57354e, ""))) {
                                }
                            } catch (JSONException e) {
                            }
                        }
                        int i6 = i3 + 1;
                        m47662a(matrixCursor, i3, abfo2);
                        i3 = i6;
                    }
                }
            }
            return matrixCursor;
        } catch (RuntimeException e2) {
            Log.w("gH_SuggestionsAdaptr", "Search suggestions query threw an exception.", e2);
            return null;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo430a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return ((ActivityBase) this.f57395k).getLayoutInflater().inflate((int) C0126R.C0128layout.gh_search_suggestions_line_item, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo431a(Cursor cursor) {
        try {
            super.mo431a(cursor);
            if (cursor != null) {
                this.f57398n = cursor.getColumnIndex("suggest_format");
                this.f57399o = cursor.getColumnIndex("suggest_text_1");
                this.f57400p = cursor.getColumnIndex("help_action_string");
            }
        } catch (Exception e) {
            String name = e.getClass().getName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
            sb.append(name);
            sb.append(": ");
            sb.append(message);
            Log.e("gH_SuggestionsAdaptr", sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final void mo432a(View view, Context context, Cursor cursor) {
        int i;
        int i2 = this.f57398n;
        if (i2 != -1) {
            try {
                i = cursor.getInt(i2);
            } catch (Exception e) {
                String name = e.getClass().getName();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                Log.e("gH_SuggestionsAdaptr", sb.toString(), e);
                i = -1;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.gh_suggestion_label);
            String a = m47661a(cursor, this.f57399o);
            String a2 = m47661a(cursor, this.f57400p);
            if (TextUtils.isEmpty(a)) {
                textView.setVisibility(8);
                return;
            }
            Spanned a3 = aasr.m46941a(a);
            textView.setText(a3);
            textView.setContentDescription(a3.toString());
            textView.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.gh_article_suggestion_icon);
            ImageView imageView2 = (ImageView) view.findViewById(C0126R.C0129id.gh_query_suggestion_icon);
            ImageView imageView3 = (ImageView) view.findViewById(C0126R.C0129id.gh_query_suggestion_refinement_icon);
            if (i == 1) {
                imageView.setImageResource(C0126R.C0127drawable.quantum_ic_drive_document_googblue_24);
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                imageView3.setVisibility(8);
            } else if (i == 2) {
                try {
                    aaso.m46936a(imageView, aasm.m46897b(a2, ""), context);
                    imageView.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView3.setVisibility(8);
                } catch (JSONException e2) {
                    view.setVisibility(8);
                }
            } else {
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                imageView3.setVisibility(0);
                imageView3.setTag(textView.getText());
                imageView3.setOnClickListener(this);
            }
        } else {
            view.setVisibility(8);
        }
    }
}
