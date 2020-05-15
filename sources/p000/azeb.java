package p000;

import android.app.DownloadManager;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: azeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azeb {

    /* renamed from: a */
    public static final Uri f99133a = DatabaseProvider.m94544h("preloadedFiles");

    /* renamed from: j */
    private static final Pattern f99134j = Pattern.compile("([^/].+)/(.+)");

    /* renamed from: k */
    private static final Uri f99135k = DatabaseProvider.m94544h("media");

    /* renamed from: l */
    private static WeakReference f99136l = new WeakReference(null);

    /* renamed from: b */
    public final Context f99137b;

    /* renamed from: c */
    public final DownloadManager f99138c;

    /* renamed from: d */
    public final Handler f99139d = new adzt(Looper.getMainLooper());

    /* renamed from: e */
    final Map f99140e = new ConcurrentHashMap();

    /* renamed from: f */
    final Map f99141f = new ConcurrentHashMap();

    /* renamed from: g */
    public final Map f99142g = new ConcurrentHashMap();

    /* renamed from: h */
    public final ContentObserver f99143h = new azdz(this, this.f99139d, "media_message_key");

    /* renamed from: i */
    public final ContentObserver f99144i = new azdz(this, this.f99139d, "preloaded_file_key");

    public azeb(Context context, DownloadManager downloadManager) {
        this.f99137b = context.getApplicationContext();
        this.f99138c = downloadManager;
    }

    /* renamed from: a */
    static Cursor m85503a(DownloadManager downloadManager, DownloadManager.Query query) {
        try {
            return downloadManager.query(query);
        } catch (SQLException | IllegalArgumentException e) {
            azoj.m85933c("DownloadManager", "DownloadManager unexpectedly threw an exception:", e);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized azeb m85504a(Context context) {
        azeb azeb;
        synchronized (azeb.class) {
            azeb = (azeb) f99136l.get();
            if (azeb == null) {
                azeb = new azeb(context, (DownloadManager) context.getApplicationContext().getSystemService("download"));
                f99136l = new WeakReference(azeb);
            }
        }
        return azeb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00df A[Catch:{ Exception -> 0x00ff, all -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9 A[Catch:{ Exception -> 0x00ff, all -> 0x00fd }] */
    /* renamed from: a */
    public static void m85505a(Context context, long j) {
        String str;
        String str2;
        char c;
        Uri uri;
        long j2 = j;
        if (j2 >= 0) {
            Long valueOf = Long.valueOf(j);
            new Object[1][0] = valueOf;
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            if (downloadManager != null) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(j2);
                Cursor a = m85503a(downloadManager, query);
                if (a != null) {
                    try {
                        if (a.moveToFirst()) {
                            int i = a.getInt(a.getColumnIndex("status"));
                            String string = a.getString(a.getColumnIndex("description"));
                            if (i == 8) {
                                Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(j2);
                                String string2 = a.getString(a.getColumnIndex("local_uri"));
                                Object[] objArr = {string2, uriForDownloadedFile};
                                new Object[1][0] = Integer.valueOf(a.getColumnIndex("local_filename"));
                                new Object[1][0] = uriForDownloadedFile;
                                str = string;
                                m85504a(context).m85507a(string, j, 2, string2, uriForDownloadedFile);
                            } else {
                                str = string;
                                m85504a(context).m85507a(str, j, 3, null, null);
                            }
                            azeb a2 = m85504a(context);
                            int hashCode = str.hashCode();
                            if (hashCode == 454658636) {
                                str2 = str;
                                if (str2.equals("media_message_key")) {
                                    c = 0;
                                    if (c == 0) {
                                    }
                                    if (uri != null) {
                                    }
                                }
                            } else if (hashCode != 658976531) {
                                str2 = str;
                            } else {
                                str2 = str;
                                if (str2.equals("preloaded_file_key")) {
                                    c = 1;
                                    if (c == 0) {
                                        uri = DatabaseProvider.m94538c(Long.toString(j));
                                    } else if (c != 1) {
                                        azoj.m85933c("DownloadManager", "Failed to get download uri for unsupported Matchstick download type: %s", str2);
                                        uri = null;
                                    } else {
                                        uri = DatabaseProvider.m94540d(Long.toString(j));
                                    }
                                    if (uri != null) {
                                        a2.f99137b.getContentResolver().notifyChange(uri, null);
                                        Object[] objArr2 = {valueOf, uri};
                                    }
                                }
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                            if (uri != null) {
                            }
                        }
                    } catch (Exception e) {
                        azoj.m85931a("DownloadManager", e, "failed to get status for downloadId: %s", Long.valueOf(j));
                    } catch (Throwable th) {
                        a.close();
                        throw th;
                    }
                    a.close();
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m85506a(azeb azeb, DownloadManager.Request request, String str, int i, String str2, byte[] bArr, azea azea) {
        String str3;
        Matcher matcher = f99134j.matcher(str2);
        if (matcher.find()) {
            String concat = String.valueOf(matcher.group(1).toUpperCase(Locale.US)).concat("_");
            String a = azeb.mo54819a(str2);
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + String.valueOf(format).length() + String.valueOf(a).length());
            sb.append(concat);
            sb.append(format);
            sb.append(a);
            str3 = sb.toString();
        } else {
            str3 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        }
        long a2 = azeb.mo54818a(request, true, str3, "media_message_key");
        if (azea != null) {
            Long valueOf = Long.valueOf(a2);
            Object[] objArr = {azea, valueOf};
            if (azeb.f99140e.isEmpty()) {
                azeb.mo54820a(f99135k, azeb.f99143h);
            }
            azeb.f99140e.put(valueOf, azea);
        }
        if (i == 3 || i == 1 || i == 2) {
            DatabaseProvider.m94528a(azeb.f99137b.getContentResolver(), str, a2, "");
        } else {
            DatabaseProvider.m94530a(azeb.f99137b.getContentResolver(), bArr, a2, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: a */
    private final void m85507a(String str, long j, int i, String str2, Uri uri) {
        char c;
        new Object[1][0] = Long.valueOf(j);
        int hashCode = str.hashCode();
        if (hashCode != 454658636) {
            if (hashCode == 658976531 && str.equals("preloaded_file_key")) {
                c = 1;
                if (c == 0) {
                    DatabaseProvider.m94526a(this.f99137b.getContentResolver(), j, i, str2);
                    return;
                } else if (c != 1) {
                    azoj.m85933c("DownloadManager", "Unsupported Matchstick Download Type: %s", str);
                    return;
                } else {
                    DatabaseProvider.m94527a(this.f99137b.getContentResolver(), j, i, str2, uri.toString());
                    return;
                }
            }
        } else if (str.equals("media_message_key")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo54818a(DownloadManager.Request request, boolean z, String str, String str2) {
        request.setTitle(str);
        request.setVisibleInDownloadsUi(z);
        request.setNotificationVisibility(2);
        request.setDescription(str2);
        try {
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str);
        } catch (IllegalStateException e) {
            azoj.m85931a("DownloadManager", e, "Using default internal storage", new Object[0]);
        }
        return this.f99138c.enqueue(request);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo54819a(String str) {
        Matcher matcher = f99134j.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String valueOf = String.valueOf(matcher.group(2).toLowerCase(Locale.US));
        return valueOf.length() == 0 ? new String(".") : ".".concat(valueOf);
    }

    /* renamed from: a */
    public final void mo54820a(Uri uri, ContentObserver contentObserver) {
        this.f99137b.getContentResolver().registerContentObserver(uri, true, contentObserver);
        new Object[1][0] = uri;
    }
}
