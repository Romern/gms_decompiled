package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: awps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awps implements bjew {

    /* renamed from: a */
    private final Context f94818a;

    public awps(Context context) {
        this.f94818a = context;
    }

    /* renamed from: a */
    public static bjfc m80649a(CallbackInput callbackInput, String str) {
        Intent a = bjfc.m103292a("integratorCallbackAction", null, new Intent());
        a.putExtra("extra_callback_input", callbackInput);
        a.putExtra("extra_callback_service_package_name", str);
        a.putExtra("extra_callback_service_action_name", "com.google.android.gms.wallet.callback.PAYMENT_DATA_CALLBACKS");
        return new bjfc(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0127 A[Catch:{ all -> 0x014a, RemoteException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0128 A[Catch:{ all -> 0x014a, RemoteException -> 0x015d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x00fc=Splitter:B:54:0x00fc, B:73:0x011c=Splitter:B:73:0x011c} */
    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent;
        CountDownLatch countDownLatch;
        Intent intent2;
        CallbackOutput callbackOutput;
        long elapsedRealtime;
        CallbackOutput callbackOutput2;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() + chim.f188655a.mo6606a().mo85261a();
        Intent intent3 = bjfc.f122612a;
        awfe awfe = new awfe(this.f94818a, intent3.getStringExtra("extra_callback_service_package_name"), intent3.getStringExtra("extra_callback_service_action_name"));
        try {
            synchronized (awfe) {
                if (!awfe.f94265g) {
                    awfe.f94265g = true;
                    if (!skh.m35531a().mo25690a(awfe.f94260b, new Intent(awfe.f94264f).setPackage(awfe.f94263e), awfe.f94262d, 1)) {
                        throw new IllegalStateException("Failed to bind to the service.");
                    }
                }
            }
            CallbackInput callbackInput = (CallbackInput) intent3.getParcelableExtra("extra_callback_input");
            Intent intent4 = new Intent();
            long elapsedRealtime3 = SystemClock.elapsedRealtime() + ((long) ((int) chim.f188655a.mo6606a().mo85262b()));
            int i = callbackInput.f110029a;
            synchronized (awfe) {
                if (awfe.f94265g) {
                    countDownLatch = awfe.f94267i;
                } else {
                    throw new IllegalStateException("Service connection has not been requested.");
                }
            }
            if (countDownLatch != null) {
                callbackOutput = awfe.m79842a(countDownLatch, elapsedRealtime3, i);
                if (callbackOutput != null) {
                    intent2 = intent4;
                    elapsedRealtime = elapsedRealtime2 - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        SystemClock.sleep(elapsedRealtime);
                    }
                    Intent intent5 = intent2;
                    intent5.putExtra("extra_callback_output", callbackOutput);
                    awfe.mo52095a();
                    intent = intent5;
                    return new bjfd(intent);
                }
            }
            int andIncrement = awfe.f94259a.getAndIncrement();
            try {
                synchronized (awfe) {
                    Messenger messenger = awfe.f94268j;
                    if (messenger != null) {
                        awfd awfd = new awfd();
                        Map map = awfe.f94266h;
                        Integer valueOf = Integer.valueOf(andIncrement);
                        map.put(valueOf, awfd);
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        int i2 = callbackInput.f110029a;
                        intent2 = intent4;
                        bundle.putString("message_task_tag", i2 != 1 ? i2 != 2 ? "Unknown Callback" : "onPaymentDataChanged Callback" : "onPaymentAuthorized Callback");
                        bundle.putByteArray("extra_callback_input", sef.m35074a(callbackInput));
                        obtain.setData(bundle);
                        obtain.replyTo = awfe.f94261c;
                        obtain.arg1 = andIncrement;
                        messenger.send(obtain);
                        callbackOutput2 = awfe.m79842a(awfd.f94257a, elapsedRealtime3, i);
                        if (callbackOutput2 == null) {
                            callbackOutput2 = (CallbackOutput) sef.m35069a(awfd.f94258b.getByteArray("extra_callback_output"), CallbackOutput.CREATOR);
                            synchronized (awfe) {
                                try {
                                    awfe.f94266h.remove(valueOf);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } else {
                            synchronized (awfe) {
                                try {
                                    awfe.f94266h.remove(valueOf);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                    } else {
                        intent2 = intent4;
                        callbackOutput2 = awfe.m79841a(4, i);
                        synchronized (awfe) {
                            try {
                                awfe.f94266h.remove(Integer.valueOf(andIncrement));
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                }
                                throw th;
                            }
                        }
                    }
                }
                callbackOutput = callbackOutput2;
                elapsedRealtime = elapsedRealtime2 - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                }
                Intent intent52 = intent2;
                intent52.putExtra("extra_callback_output", callbackOutput);
                awfe.mo52095a();
                intent = intent52;
            } catch (Throwable th4) {
                synchronized (awfe) {
                    awfe.f94266h.remove(Integer.valueOf(andIncrement));
                    throw th4;
                }
            }
        } catch (RemoteException e) {
            try {
                Log.e("IntegCallbackAction", "IntegratorCallbackAction failed!", e);
                intent = bjfd.m103295a(3);
            } finally {
                awfe.mo52095a();
            }
        } catch (Throwable th5) {
            while (true) {
                th = th5;
            }
            throw th;
        }
        return new bjfd(intent);
    }
}
