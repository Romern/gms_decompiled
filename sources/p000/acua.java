package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* renamed from: acua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acua {
    /* renamed from: a */
    public static int m49849a(bpzq bpzq) {
        bpzo bpzo = bpzo.CONTENT_UPDATE;
        switch (bpzq.ordinal()) {
            case 0:
                return C0126R.string.no_error;
            case 1:
                return C0126R.string.generic_error;
            case 2:
                return C0126R.string.invalid_indexable;
            case 3:
                return C0126R.string.sequence_table_full;
            case 4:
                return C0126R.string.internal_error;
            case 5:
                return C0126R.string.client_disconnected;
            case 6:
                return C0126R.string.invalid_indexable_over_max_nesting_depth;
            case 7:
                return C0126R.string.invalid_indexable_unsupported_data_type;
            case 8:
                return C0126R.string.invalid_indexable_string_value_too_long;
            case 9:
                return C0126R.string.invalid_indexable_string_key_too_long;
            case 10:
                return C0126R.string.invalid_indexable_too_many_repeated_values;
            case 11:
                return C0126R.string.invalid_indexable_same_as_field_repeated;
            case 12:
                return C0126R.string.invalid_indexable_invalid_web_url;
            case 13:
                return C0126R.string.invalid_indexable_metadata_at_non_top_level;
            case 14:
                return C0126R.string.invalid_indexable_too_many_fields;
            case 15:
                return C0126R.string.invalid_indexable_intent_not_handled;
            case 16:
                return C0126R.string.invalid_indexable_missing_required_field;
            case 17:
                return C0126R.string.invalid_indexable_invalid_repeated_field;
            case 18:
                return C0126R.string.not_allowed;
            case 19:
                return C0126R.string.invalid_argument_null;
            case 20:
                return C0126R.string.invalid_argument_too_many;
            case 21:
                return C0126R.string.invalid_argument_uri;
            case 22:
                return C0126R.string.invalid_indexable_too_large;
            case 23:
                return C0126R.string.invalid_argument_uri_too_long;
            case 24:
                return C0126R.string.call_in_progress;
            case 25:
                return C0126R.string.invalid_action_event_status;
            case 26:
                return C0126R.string.invalid_query_text;
            case 27:
                return C0126R.string.invalid_query_types;
            case 28:
                return C0126R.string.invalid_query_no_index;
            case 29:
                return C0126R.string.invalid_indexable_invalid_type_at_top_level;
            case 30:
                return C0126R.string.no_permission;
            case 31:
                return C0126R.string.invalid_indexable_bad_patch;
            case 32:
                return C0126R.string.invalid_request;
            case 33:
                return C0126R.string.feature_off;
            case 34:
                return C0126R.string.invalid_indexable_bad_parcelable;
            case 35:
                return C0126R.string.invalid_indexable_invalid_scope;
            case 36:
                return C0126R.string.invalid_indexable_invalid_account;
            case FelicaException.TYPE_NOT_CLOSED:
                return C0126R.string.invalid_indexable_unpaired_surrogate;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return C0126R.string.invalid_action_url_mismatch;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return C0126R.string.invalid_indexable_invalid_slice_uri;
            case FelicaException.TYPE_PUSH_FAILED:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return C0126R.string.null_slice;
            case 41:
                return C0126R.string.invalid_indexable_slice_not_serializable;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return C0126R.string.slice_timed_out;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return C0126R.string.invalid_argument_check_sequence_table;
            case FelicaException.TYPE_RESET_FAILED:
                return C0126R.string.slice_too_large;
            case 47:
                return C0126R.string.invalid_slice_uri_type;
            case 48:
                return C0126R.string.invalid_slice_argument;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return C0126R.string.invalid_slice_authority;
            case 50:
                return C0126R.string.temporary_redirect;
            default:
                return C0126R.string.unknown_error;
        }
    }

    /* renamed from: b */
    public static Spanned m49864b(String str) {
        int i = Build.VERSION.SDK_INT;
        return Html.fromHtml(str, 0);
    }

    /* renamed from: c */
    private static String m49867c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m49850a(int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = String.valueOf(str).concat("&nbsp;&nbsp;&nbsp;&nbsp;");
        }
        return str;
    }

    /* renamed from: b */
    public static String m49865b(long j) {
        return DateUtils.getRelativeTimeSpanString(j, Calendar.getInstance().getTimeInMillis(), 1000, 0).toString();
    }

    /* renamed from: a */
    public static String m49851a(long j) {
        return j != 0 ? new SimpleDateFormat("dd MMM yyyy HH:mm:ss z", Locale.US).format(new Date(j)) : "Unknown";
    }

    /* renamed from: a */
    public static String m49852a(bpzo bpzo) {
        bpzq bpzq = bpzq.NO_ERROR;
        switch (bpzo.ordinal()) {
            case 0:
                return "Update";
            case 1:
                return "Remove";
            case 2:
                return "RemoveAll";
            case 3:
                return "Start";
            case 4:
                return "End";
            case 5:
                return "UpdateTags";
            case 6:
                return "Get";
            case 7:
                return "Search";
            case 8:
                return "Patch";
            case 9:
                return "Mutate (request invalid)";
            case 10:
                return "RemoveTypes";
            default:
                return "Unknown call type";
        }
    }

    /* renamed from: a */
    public static String m49853a(String str) {
        return str.equals("Thing") ? "Indexable" : str;
    }

    /* renamed from: b */
    private static void m49866b(StringBuilder sb, int i) {
        sb.append("<br>");
        sb.append(m49850a(i));
        sb.append("}");
    }

    /* renamed from: a */
    public static void m49854a(Context context, String str, String str2, Integer num) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(String.valueOf(str2).concat(".")).setPositiveButton((int) C0126R.string.common_ok, (DialogInterface.OnClickListener) null).show();
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(": statusCode=");
        sb.append(valueOf);
        sb.append(".");
        absg.m48184a(sb.toString());
    }

    /* renamed from: a */
    public static void m49855a(View view, ActionImpl actionImpl) {
        StringBuilder sb = new StringBuilder();
        m49863a(sb, "type", actionImpl.f152341a, 0);
        m49863a(sb, "objectName", actionImpl.f152342b, 0);
        m49863a(sb, "objectUrl", actionImpl.f152343c, 0);
        m49863a(sb, "objectSameAs", actionImpl.f152344d, 0);
        m49863a(sb, "actionStatus", actionImpl.f152346f, 0);
        m49861a(sb, actionImpl.f152347g, 0);
        ActionImpl.MetadataImpl metadataImpl = actionImpl.f152345e;
        sb.append("<br>");
        sb.append(m49850a(0));
        sb.append("<b>metadata: </b>");
        m49860a(sb, 0);
        m49863a(sb, "uploadable", Boolean.valueOf(metadataImpl.f152349b), 1);
        m49866b(sb, 0);
        ((TextView) view.findViewById(C0126R.C0129id.user_action_text)).setText(m49864b(sb.toString()));
    }

    /* renamed from: a */
    public static void m49856a(View view, Thing thing) {
        StringBuilder sb = new StringBuilder();
        m49862a(sb, thing, 0);
        m49857a(view, sb.toString());
    }

    /* renamed from: a */
    public static void m49857a(View view, String str) {
        ((TextView) view).setText(m49864b(str));
    }

    /* renamed from: a */
    public static void m49858a(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int paddingTop = listView.getPaddingTop() + listView.getPaddingBottom();
            for (int i = 0; i < adapter.getCount(); i++) {
                View view = adapter.getView(i, null, listView);
                if (view instanceof ViewGroup) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(0, 0);
                paddingTop += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = paddingTop + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static void m49859a(TextView textView, String str) {
        if (str == null) {
            str = "";
        }
        String htmlEncode = TextUtils.htmlEncode(str);
        StringBuilder sb = new StringBuilder(String.valueOf(htmlEncode).length() + 31);
        sb.append("<font color=blue><u>");
        sb.append(htmlEncode);
        sb.append("</u></font>");
        textView.setText(m49864b(sb.toString()));
    }

    /* renamed from: a */
    private static void m49860a(StringBuilder sb, int i) {
        sb.append("<br>");
        sb.append(m49850a(i));
        sb.append("{");
    }

    /* renamed from: a */
    private static void m49861a(StringBuilder sb, Bundle bundle, int i) {
        Set<String> keySet = bundle.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            m49863a(sb, str, bundle.get(str), i);
        }
    }

    /* renamed from: a */
    private static void m49862a(StringBuilder sb, Thing thing, int i) {
        m49863a(sb, "url", thing.f152372d, i);
        m49863a(sb, "type", m49853a(thing.f152373e), i);
        m49861a(sb, thing.f152370b, i);
        Thing.Metadata metadata = thing.f152371c;
        if (i <= 0 || !metadata.mo72358a()) {
            sb.append("<br>");
            sb.append(m49850a(i));
            sb.append("<b>metadata: </b>");
            m49860a(sb, i);
            int i2 = i + 1;
            m49863a(sb, "worksOffline", Boolean.valueOf(metadata.f152374a), i2);
            m49863a(sb, "score", Integer.valueOf(metadata.f152375b), i2);
            if (celx.m137224d()) {
                String str = metadata.f152376c;
                if (!TextUtils.isEmpty(str)) {
                    m49863a(sb, "accountEmail", str, i2);
                }
            }
            if (acaw.m48784a()) {
                long[] b = metadata.mo72360b("scope");
                if (b != null && b.length == 1 && (b[0] != 1 || celx.m137224d())) {
                    m49863a(sb, "scope", brib.m114027c((int) b[0]), i2);
                } else if (b != null && b.length > 1) {
                    m49863a(sb, "scope", Arrays.toString(b), i2);
                }
            }
            String[] a = metadata.mo72359a("sliceUri");
            if (a != null && a.length > 0) {
                m49863a(sb, "sliceUri", a[0], i2);
            }
            m49866b(sb, i);
        }
    }

    /* renamed from: a */
    private static void m49863a(StringBuilder sb, String str, Object obj, int i) {
        if (sb.length() > 0) {
            sb.append("<br>");
        }
        sb.append(m49850a(i));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9);
        sb2.append("<b>");
        sb2.append(str);
        sb2.append(": </b>");
        sb.append(sb2.toString());
        if (obj == null) {
            sb.append("<null>");
        } else if (obj.getClass().isArray()) {
            sb.append("[");
            int length = Array.getLength(obj);
            if (str.equals("serializedSliceBytes")) {
                StringBuilder sb3 = new StringBuilder(22);
                sb3.append(" ... ");
                sb3.append(length);
                sb3.append(" bytes");
                sb.append(sb3.toString());
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = Array.get(obj, i2);
                    String simpleName = obj2.getClass().getSimpleName();
                    if (simpleName.equals("Thing")) {
                        m49860a(sb, i);
                        m49862a(sb, (Thing) obj2, i + 1);
                        m49866b(sb, i);
                    } else if (simpleName.equals("String")) {
                        sb.append(m49867c((String) Array.get(obj, i2)));
                    } else if (!simpleName.equals("Long") || (!str.equals("dateCreated") && !str.equals("dateModified") && !str.equals("dateSent") && !str.equals("dateReceived") && !str.equals("dateRead"))) {
                        sb.append(Array.get(obj, i2));
                    } else {
                        sb.append(m49851a(((Long) Array.get(obj, i2)).longValue()));
                    }
                    if (i2 != length - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("]");
        } else if (obj.getClass().getSimpleName().equals("String")) {
            sb.append(m49867c(obj.toString()));
        } else {
            sb.append(obj.toString());
        }
    }
}
