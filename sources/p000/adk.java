package p000;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: adk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adk extends aja implements View.OnClickListener {

    /* renamed from: a */
    public int f265a = 1;

    /* renamed from: j */
    private final SearchView f266j;

    /* renamed from: k */
    private final SearchableInfo f267k;

    /* renamed from: l */
    private final Context f268l;

    /* renamed from: m */
    private final WeakHashMap f269m;

    /* renamed from: n */
    private final int f270n;

    /* renamed from: o */
    private ColorStateList f271o;

    /* renamed from: p */
    private int f272p = -1;

    /* renamed from: q */
    private int f273q = -1;

    /* renamed from: r */
    private int f274r = -1;

    /* renamed from: s */
    private int f275s = -1;

    /* renamed from: t */
    private int f276t = -1;

    /* renamed from: u */
    private int f277u = -1;

    public adk(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.f1258k);
        this.f266j = searchView;
        this.f267k = searchableInfo;
        this.f270n = searchView.f1259l;
        this.f268l = context;
        this.f269m = weakHashMap;
    }

    /* renamed from: a */
    private final Drawable m500a(Uri uri) {
        InputStream openInputStream;
        int i;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    String authority = uri.getAuthority();
                    if (!TextUtils.isEmpty(authority)) {
                        Resources resourcesForApplication = this.f625e.getPackageManager().getResourcesForApplication(authority);
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments != null) {
                            int size = pathSegments.size();
                            if (size == 1) {
                                i = Integer.parseInt(pathSegments.get(0));
                            } else if (size == 2) {
                                i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                            } else {
                                throw new FileNotFoundException("More than two path segments: " + uri);
                            }
                            if (i != 0) {
                                return resourcesForApplication.getDrawable(i);
                            }
                            throw new FileNotFoundException("No resource found for: " + uri);
                        }
                        throw new FileNotFoundException("No path: " + uri);
                    }
                    throw new FileNotFoundException("No authority: " + uri);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new FileNotFoundException("No package found for authority: " + uri);
                } catch (NumberFormatException e2) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                } catch (Resources.NotFoundException e3) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                openInputStream = this.f268l.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        openInputStream.close();
                    } catch (IOException e4) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
                    }
                    return createFromStream;
                }
                throw new FileNotFoundException("Failed to open " + uri);
            }
        } catch (FileNotFoundException e5) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (IOException e6) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e6);
            }
            throw th;
        }
    }

    /* renamed from: b */
    private final Drawable m507b(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f269m.get(str);
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return null;
    }

    /* renamed from: d */
    private static final void m508d(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle == null || bundle.getBoolean("in_progress")) {
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo803b(this.f625e, this.f624d, viewGroup);
            if (b != null) {
                ((adj) b.getTag()).f260a.setText(e.toString());
            }
            return b;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo430a(this.f625e, this.f624d, viewGroup);
            if (a != null) {
                ((adj) a.getTag()).f260a.setText(e.toString());
            }
            return a;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m508d(this.f624d);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m508d(this.f624d);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f266j.mo1621b((CharSequence) tag);
        }
    }

    /* renamed from: b */
    public final CharSequence mo433b(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m503a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f267k.shouldRewriteQueryFromData() && (a2 = m503a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f267k.shouldRewriteQueryFromText() || (a = m503a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private final Drawable m501a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f268l.getPackageName() + "/" + parseInt;
            Drawable b = m507b(str2);
            if (b != null) {
                return b;
            }
            Drawable a = C1133kh.m17836a(this.f268l, parseInt);
            m506a(str2, a);
            return a;
        } catch (NumberFormatException e) {
            Drawable b2 = m507b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a2 = m500a(Uri.parse(str));
            m506a(str, a2);
            return a2;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private static String m502a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m503a(Cursor cursor, String str) {
        return m502a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static final void m504a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private static final void m505a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private final void m506a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f269m.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: a */
    public final Cursor mo429a(CharSequence charSequence) {
        Cursor cursor;
        String suggestAuthority;
        String[] strArr;
        String charSequence2 = charSequence != null ? charSequence.toString() : "";
        if (this.f266j.getVisibility() != 0 || this.f266j.getWindowVisibility() != 0) {
            return null;
        }
        try {
            SearchableInfo searchableInfo = this.f267k;
            if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                cursor = null;
            } else {
                Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                String suggestPath = searchableInfo.getSuggestPath();
                if (suggestPath != null) {
                    fragment.appendEncodedPath(suggestPath);
                }
                fragment.appendPath("search_suggest_query");
                String suggestSelection = searchableInfo.getSuggestSelection();
                if (suggestSelection != null) {
                    strArr = new String[]{charSequence2};
                } else {
                    fragment.appendPath(charSequence2);
                    strArr = null;
                }
                fragment.appendQueryParameter("limit", "50");
                cursor = this.f625e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
            }
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    /* renamed from: a */
    public final View mo430a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo430a(context, cursor, viewGroup);
        a.setTag(new adj(a));
        ((ImageView) a.findViewById(C0126R.C0129id.edit_query)).setImageResource(this.f270n);
        return a;
    }

    /* renamed from: a */
    public final void mo431a(Cursor cursor) {
        try {
            super.mo431a(cursor);
            if (cursor != null) {
                this.f272p = cursor.getColumnIndex("suggest_text_1");
                this.f273q = cursor.getColumnIndex("suggest_text_2");
                this.f274r = cursor.getColumnIndex("suggest_text_2_url");
                this.f275s = cursor.getColumnIndex("suggest_icon_1");
                this.f276t = cursor.getColumnIndex("suggest_icon_2");
                this.f277u = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public final void mo432a(View view, Context context, Cursor cursor) {
        int i;
        Drawable drawable;
        Drawable drawable2;
        Drawable.ConstantState constantState;
        CharSequence charSequence;
        Cursor cursor2 = cursor;
        adj adj = (adj) view.getTag();
        int i2 = this.f277u;
        if (i2 != -1) {
            i = cursor2.getInt(i2);
        } else {
            i = 0;
        }
        if (adj.f260a != null) {
            m505a(adj.f260a, m502a(cursor2, this.f272p));
        }
        if (adj.f261b != null) {
            String a = m502a(cursor2, this.f274r);
            if (a == null) {
                charSequence = m502a(cursor2, this.f273q);
            } else {
                if (this.f271o == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f625e.getTheme().resolveAttribute(C0126R.attr.textColorSearchUrl, typedValue, true);
                    this.f271o = this.f625e.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(a);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f271o, null), 0, a.length(), 33);
                charSequence = spannableString;
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = adj.f260a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    adj.f260a.setMaxLines(2);
                }
            } else {
                TextView textView2 = adj.f260a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    adj.f260a.setMaxLines(1);
                }
            }
            m505a(adj.f261b, charSequence);
        }
        ImageView imageView = adj.f262c;
        Drawable drawable3 = null;
        if (imageView != null) {
            int i3 = this.f275s;
            if (i3 != -1) {
                drawable = m501a(cursor2.getString(i3));
                if (drawable == null) {
                    ComponentName searchActivity = this.f267k.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f269m.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f269m.get(flattenToShortString);
                        drawable = constantState2 != null ? constantState2.newDrawable(this.f268l.getResources()) : null;
                    } else {
                        PackageManager packageManager = this.f625e.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable2 = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable2 == null) {
                                    Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                    drawable2 = null;
                                }
                            } else {
                                drawable2 = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                            drawable2 = null;
                        }
                        if (drawable2 != null) {
                            constantState = drawable2.getConstantState();
                        } else {
                            constantState = null;
                        }
                        this.f269m.put(flattenToShortString, constantState);
                        drawable = drawable2;
                    }
                    if (drawable == null) {
                        drawable = this.f625e.getPackageManager().getDefaultActivityIcon();
                    }
                }
            } else {
                drawable = null;
            }
            m504a(imageView, drawable, 4);
        }
        ImageView imageView2 = adj.f263d;
        if (imageView2 != null) {
            int i4 = this.f276t;
            if (i4 != -1) {
                drawable3 = m501a(cursor2.getString(i4));
            }
            m504a(imageView2, drawable3, 8);
        }
        if (this.f265a == 1 && (i & 1) != 0) {
            adj.f264e.setVisibility(0);
            adj.f264e.setTag(adj.f260a.getText());
            adj.f264e.setOnClickListener(this);
            return;
        }
        adj.f264e.setVisibility(8);
    }
}
