package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.BinderWrapper;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeedbackAsyncChimeraService extends Service {

    /* renamed from: a */
    public static final C1223np f31571a = new C1223np();

    /* renamed from: b */
    public static final bqgj f31572b = snp.m35702a(10);

    /* renamed from: c */
    private final IBinder f31573c = new wza(this);

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ReportTransferIntentOperation extends IntentOperation {
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0075 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0079 A[SYNTHETIC, Splitter:B:40:0x0079] */
        public final void onHandleIntent(Intent intent) {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = null;
            try {
                BinderWrapper binderWrapper = (BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_BYTES");
                int intExtra = intent.getIntExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", 0);
                if (binderWrapper != null) {
                    if (intExtra != 0) {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        binderWrapper.f30210a.transact(0, obtain2, obtain, 0);
                        obtain2.recycle();
                        byte[] bArr = new byte[intExtra];
                        obtain.readByteArray(bArr);
                        obtain.recycle();
                        ParcelFileDescriptor a = FeedbackAsyncChimeraService.m23355a((BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER"));
                        if (a != null) {
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(a);
                            try {
                                autoCloseOutputStream2.write(bArr);
                                autoCloseOutputStream2.flush();
                            } catch (Exception e) {
                                e = e;
                                autoCloseOutputStream = autoCloseOutputStream2;
                                try {
                                    Log.e("gf_FeedbackAsyncService", "Exception while transferring report", e);
                                    if (autoCloseOutputStream == null) {
                                        try {
                                            autoCloseOutputStream.close();
                                            return;
                                        } catch (IOException e2) {
                                            e = e2;
                                            Log.e("gf_FeedbackAsyncService", "Exception while closing report output stream", e);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (autoCloseOutputStream != null) {
                                        try {
                                            autoCloseOutputStream.close();
                                        } catch (IOException e3) {
                                            Log.e("gf_FeedbackAsyncService", "Exception while closing report output stream", e3);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                autoCloseOutputStream = autoCloseOutputStream2;
                                if (autoCloseOutputStream != null) {
                                }
                                throw th;
                            }
                            try {
                                autoCloseOutputStream2.close();
                                return;
                            } catch (IOException e4) {
                                e = e4;
                                Log.e("gf_FeedbackAsyncService", "Exception while closing report output stream", e);
                                return;
                            }
                        } else {
                            Log.e("gf_FeedbackAsyncService", "Failed to get FileDescriptor");
                            return;
                        }
                    }
                }
                Log.e("gf_FeedbackAsyncService", "Failed to get report bytes");
            } catch (Exception e5) {
                e = e5;
                Log.e("gf_FeedbackAsyncService", "Exception while transferring report", e);
                if (autoCloseOutputStream == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (autoCloseOutputStream != null) {
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    static ParcelFileDescriptor m23355a(BinderWrapper binderWrapper) {
        if (binderWrapper != null) {
            IBinder iBinder = binderWrapper.f30210a;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                iBinder.transact(0, obtain2, obtain, 0);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                obtain2.recycle();
                return parcelFileDescriptor;
            } catch (RemoteException e) {
                Log.e("gf_FeedbackAsyncService", "Failed to get FileDescriptor", e);
                return null;
            }
        } else {
            Log.e("gf_FeedbackAsyncService", "No binder wrapper found");
            return null;
        }
    }

    /* renamed from: b */
    public static void m23358b(Context context, ErrorReport errorReport) {
        byte[] bArr;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            try {
                Parcel obtain = Parcel.obtain();
                wvh.m42339a(errorReport, obtain, 0);
                bArr = obtain.marshall();
                obtain.recycle();
            } catch (NullPointerException e) {
                if (Build.MODEL.toLowerCase(Locale.ENGLISH).contains("vivo")) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Got NPE when trying to create report for Vivo: ");
                    sb.append(valueOf);
                    Log.e("gf_FeedbackAsyncService", sb.toString());
                    bArr = null;
                } else {
                    throw e;
                }
            }
            if (bArr != null) {
                Intent startIntent = IntentOperation.getStartIntent(context, ReportTransferIntentOperation.class, "com.google.android.gms.feedback.transfer_report");
                if (startIntent != null) {
                    startIntent.putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length);
                    startIntent.putExtra("com.google.android.gms.feedback.REPORT_BYTES", new BinderWrapper(new wvz(bArr)));
                    startIntent.putExtra("com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER", m23356a(parcelFileDescriptor2));
                    context.startService(startIntent);
                }
                context.startService(new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService").putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length).putExtra("com.google.android.gms.feedback.REPORT_READER_BINDER", m23356a(parcelFileDescriptor)));
            }
        } catch (IOException e2) {
            Log.e("gf_FeedbackAsyncService", "Exception while creating IPC pipe to transfer report", e2);
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f31573c;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        if (intent != null) {
            int intExtra = intent.getIntExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", 0);
            if (intExtra != 0) {
                ParcelFileDescriptor a = m23355a((BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_READER_BINDER"));
                if (a == null) {
                    Log.e("gf_FeedbackAsyncService", "Failed to get FileDescriptor");
                    autoCloseInputStream = null;
                } else {
                    autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(a);
                }
                if (autoCloseInputStream != null) {
                    f31572b.execute(new wvv(this, intExtra, autoCloseInputStream));
                    return 2;
                }
                Log.e("gf_FeedbackAsyncService", "Unable to get input stream.");
                stopSelf();
                return 2;
            }
            Log.e("gf_FeedbackAsyncService", "Empty report!");
        }
        stopSelf();
        return 2;
    }

    /* renamed from: a */
    private static BinderWrapper m23356a(ParcelFileDescriptor parcelFileDescriptor) {
        return new BinderWrapper(new wvw(parcelFileDescriptor));
    }

    /* renamed from: a */
    public static void m23357a(Context context, FeedbackOptions feedbackOptions) {
        if (feedbackOptions != null) {
            wvy wvy = new wvy("feedback", feedbackOptions, context);
            skh.m35531a().mo25690a(context, new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService"), wvy, 1);
        }
    }

    /* renamed from: a */
    public final wxg mo18588a() {
        return new wxg(this);
    }

    /* renamed from: a */
    public final void mo18589a(Context context, ErrorReport errorReport) {
        try {
            wyb.m42456a(context, wyb.m42461b(errorReport, context));
            OfflineReportSendTaskChimeraService.m23397a(context);
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Error saving report: ");
            sb.append(valueOf);
            Log.e("gf_FeedbackAsyncService", sb.toString());
        } catch (IllegalArgumentException | wxv e2) {
            Log.e("gf_FeedbackAsyncService", "invalid report", e2);
        }
    }

    /* renamed from: a */
    public final void mo18590a(ErrorReport errorReport) {
        String str = errorReport.f31511B;
        if (!TextUtils.isEmpty(str)) {
            if (!str.toLowerCase(Locale.ENGLISH).equals("anonymous")) {
                List d = soz.m35801d(this, getPackageName());
                int size = d.size();
                int i = 0;
                while (i < size) {
                    if (!((Account) d.get(i)).name.equals(str)) {
                        i++;
                    } else {
                        return;
                    }
                }
                Log.e("gf_FeedbackAsyncService", "Requested account was not found on device. Submitting anonymously");
            }
            errorReport.f31511B = "";
        }
    }

    /* renamed from: b */
    public static void m23359b(Context context, FeedbackOptions feedbackOptions) {
        if (feedbackOptions != null) {
            wwa wwa = new wwa("feedback", feedbackOptions, context);
            skh.m35531a().mo25690a(context, new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService"), wwa, 1);
        }
    }
}
