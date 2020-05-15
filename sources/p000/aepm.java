package p000;

import android.database.DataSetObserver;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;
import com.google.android.places.p095ui.autocomplete.SessionLogger;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aepm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepm implements ListAdapter, Filterable, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final aepl f63596a = new aepl(this);

    /* renamed from: b */
    public aepd f63597b;

    /* renamed from: c */
    public final rkb f63598c;

    /* renamed from: d */
    rke f63599d;

    /* renamed from: e */
    public LatLngBounds f63600e;

    /* renamed from: f */
    public AutocompleteFilter f63601f;

    /* renamed from: g */
    public bikt f63602g;

    /* renamed from: h */
    public bikr f63603h;

    /* renamed from: i */
    public final aenc f63604i;

    /* renamed from: j */
    private final Set f63605j = new HashSet();

    public aepm(rkb rkb) {
        aenc aenc = aema.f63505e;
        this.f63598c = rkb;
        this.f63604i = aenc;
        this.f63597b = aepd.f63579f;
    }

    /* renamed from: a */
    public final aekw getItem(int i) {
        aepd aepd = this.f63597b;
        int i2 = aepd.f63581a;
        if ((i2 == 3 || i2 == 5) && i < aepd.f63583c.size()) {
            return (aekw) this.f63597b.f63583c.get(i);
        }
        return null;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        aepd aepd = this.f63597b;
        int i = aepd.f63581a;
        if (i == 3) {
            return aepd.f63583c.size() + 1;
        }
        if (i != 5) {
            return 1;
        }
        return aepd.f63583c.size() + 1;
    }

    public final Filter getFilter() {
        return this.f63596a;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        aepd aepd = this.f63597b;
        int i2 = aepd.f63581a;
        if ((i2 == 3 || i2 == 5) && i < aepd.f63583c.size()) {
            return 1;
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        LayoutInflater from = LayoutInflater.from(((rmx) this.f63598c).f43323c);
        if (itemViewType != 0) {
            if (view == null) {
                view = from.inflate((int) C0126R.C0128layout.place_autocomplete_item_prediction, viewGroup, false);
            }
            mo34423a(view, i);
        } else {
            if (view == null) {
                view = from.inflate((int) C0126R.C0128layout.place_autocomplete_item_powered_by_google, viewGroup, false);
            }
            mo34422a(view);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        return getItemViewType(i) == 1;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (!this.f63597b.mo34415a()) {
            mo34424a((rke) null);
            if (this.f63598c.mo24805i()) {
                aekw a = getItem(i);
                mo34421a(aepd.m52333a(this.f63597b, i));
                rke a2 = aenc.m52185a(this.f63598c, a.mo34282d());
                mo34424a(a2);
                a2.mo9458a(new aeph(this, i, a));
                return;
            }
            mo34421a(aepd.f63580g);
        }
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f63605j.add(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f63605j.remove(dataSetObserver);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity.a(com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity, com.google.android.gms.common.api.Status):void
      com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo34421a(aepd aepd) {
        aekw aekw;
        int i;
        String str;
        this.f63597b = aepd;
        int i2 = aepd.f63581a;
        if (i2 == 4 || i2 == 7) {
            if (Log.isLoggable("Places", 6)) {
                Status status = aepd.f63582b;
                if (status != null) {
                    str = aemj.m52156a(status.f30115i);
                } else {
                    str = "Unknown";
                }
                String valueOf = String.valueOf(str);
                Log.e("Places", valueOf.length() == 0 ? new String("Error while autocompleting: ") : "Error while autocompleting: ".concat(valueOf));
            }
            Status status2 = aepd.f63582b;
            if (!(status2 == null || (i = status2.f30115i) == 0 || i == 7 || i == 8 || i == 9005 || i == 9006)) {
                switch (i) {
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        bikt bikt = this.f63602g;
                        if (bikt != null) {
                            bikt.f120798a.mo71311a(2, null, status2);
                            break;
                        }
                        break;
                }
            }
        }
        for (DataSetObserver dataSetObserver : this.f63605j) {
            if (this.f63597b.f63583c.size() > 0) {
                dataSetObserver.onChanged();
            } else {
                dataSetObserver.onInvalidated();
            }
        }
        bikr bikr = this.f63603h;
        if (bikr != null) {
            aepd aepd2 = this.f63597b;
            int i3 = aepd2.f63581a;
            if (i3 != 3) {
                if (i3 == 4) {
                    AutocompleteChimeraActivity autocompleteChimeraActivity = bikr.f120796a;
                    autocompleteChimeraActivity.f151397e.f151422i++;
                    autocompleteChimeraActivity.mo71312a(autocompleteChimeraActivity.getString(C0126R.string.place_picker_search_error), true);
                } else if (i3 != 5) {
                    if (i3 == 6) {
                        AutocompleteChimeraActivity autocompleteChimeraActivity2 = bikr.f120796a;
                        SessionLogger sessionLogger = autocompleteChimeraActivity2.f151397e;
                        int i4 = aepd2.f63584d;
                        sessionLogger.f151417d = true;
                        sessionLogger.f151420g = i4;
                        biix.m102463a(autocompleteChimeraActivity2, autocompleteChimeraActivity2.f151399g);
                        aepd aepd3 = bikr.f120796a.f151398f.f120804a.f63597b;
                        if (aepd3.mo34415a()) {
                            aekw = (aekw) aepd3.f63583c.get(aepd3.f63584d);
                        } else {
                            aekw = null;
                        }
                        AutocompleteChimeraActivity autocompleteChimeraActivity3 = bikr.f120796a;
                        autocompleteChimeraActivity3.f151405m = true;
                        autocompleteChimeraActivity3.f151399g.setText(aekw.mo34278a(null));
                        EditText editText = bikr.f120796a.f151399g;
                        editText.setSelection(editText.getText().length());
                    } else if (i3 == 7) {
                        AutocompleteChimeraActivity autocompleteChimeraActivity4 = bikr.f120796a;
                        autocompleteChimeraActivity4.f151397e.f151423j++;
                        autocompleteChimeraActivity4.mo71312a(autocompleteChimeraActivity4.getString(C0126R.string.place_picker_search_error), true);
                    } else if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Unknown PlaceAutocompleteAdapter state change.");
                    }
                } else if (aepd2.f63583c.isEmpty()) {
                    bikr.f120796a.mo71312a(bikr.f120796a.getString(C0126R.string.place_autocomplete_noresults_for_query, new Object[]{bikr.f120796a.f151399g.getText().toString()}), false);
                } else {
                    bikr.f120796a.mo71315h();
                }
            } else if (bikr.f120796a.f151404l.getVisibility() == 0) {
                bikr.f120796a.f151402j.setVisibility(0);
                bikr.f120796a.f151404l.setVisibility(8);
            } else {
                bikr.f120796a.mo71315h();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* renamed from: a */
    public final void mo34422a(View view) {
        boolean z;
        int count;
        int i;
        aepd aepd = this.f63597b;
        int i2 = 4;
        int i3 = 0;
        if (aepd.f63581a != 3 || !aepd.f63583c.isEmpty()) {
            aepd aepd2 = this.f63597b;
            if (!((aepd2.f63581a == 5 && aepd2.f63583c.isEmpty()) || (i = this.f63597b.f63581a) == 4 || i == 7 || i == 6)) {
                z = false;
                count = getCount();
                View findViewById = view.findViewById(C0126R.C0129id.place_autocomplete_progress);
                if (z) {
                    i2 = 0;
                }
                findViewById.setVisibility(i2);
                View findViewById2 = view.findViewById(C0126R.C0129id.place_autocomplete_separator);
                if (count <= 1) {
                    i3 = 8;
                }
                findViewById2.setVisibility(i3);
            }
        }
        z = true;
        count = getCount();
        View findViewById3 = view.findViewById(C0126R.C0129id.place_autocomplete_progress);
        if (z) {
        }
        findViewById3.setVisibility(i2);
        View findViewById22 = view.findViewById(C0126R.C0129id.place_autocomplete_separator);
        if (count <= 1) {
        }
        findViewById22.setVisibility(i3);
    }

    /* renamed from: a */
    public final void mo34423a(View view, int i) {
        aekw a = getItem(i);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.place_autocomplete_prediction_secondary_text);
        CharSequence a2 = a.mo34278a(new ForegroundColorSpan(view.getContext().getResources().getColor(C0126R.color.place_autocomplete_prediction_primary_text_highlight)));
        CharSequence g = a.mo34284g();
        ((TextView) view.findViewById(C0126R.C0129id.place_autocomplete_prediction_primary_text)).setText(a2);
        textView.setText(g);
        View findViewById = view.findViewById(C0126R.C0129id.place_autocomplete_separator);
        if (TextUtils.isEmpty(g)) {
            textView.setVisibility(8);
            findViewById.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        findViewById.setVisibility(0);
    }

    /* renamed from: a */
    public final synchronized void mo34424a(rke rke) {
        rke rke2 = this.f63599d;
        if (rke2 != null) {
            rke2.mo9460b();
        }
        this.f63599d = rke;
    }
}
