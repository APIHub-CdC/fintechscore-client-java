package io.FintechScore.api;

import com.google.gson.reflect.TypeToken;

import io.FintechScore.client.ApiCallback;
import io.FintechScore.client.ApiClient;
import io.FintechScore.client.ApiException;
import io.FintechScore.client.ApiResponse;
import io.FintechScore.client.Configuration;
import io.FintechScore.client.Pair;
import io.FintechScore.client.ProgressRequestBody;
import io.FintechScore.client.ProgressResponseBody;
import io.FintechScore.model.Errores;
import io.FintechScore.model.Peticion;
import io.FintechScore.model.PeticionFolio;
import io.FintechScore.model.Respuesta;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FintechScoreApi {
    private ApiClient apiClient;
    public FintechScoreApi() {
        this(Configuration.getDefaultApiClient());
    }
    public FintechScoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getReporteCall(String xApiKey, String username, String password, Peticion body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReporteValidateBeforeCall(String xApiKey, String username, String password, Peticion body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getReporte(Async)");
        }
        
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getReporte(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getReporte(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getReporte(Async)");
        }
        
        okhttp3.Call call = getReporteCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta getReporte(String xApiKey, String username, String password, Peticion body) throws ApiException {
        ApiResponse<Respuesta> resp = getReporteWithHttpInfo(xApiKey, username, password, body);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> getReporteWithHttpInfo(String xApiKey,  String username, String password, Peticion body) throws ApiException {
        okhttp3.Call call = getReporteValidateBeforeCall(xApiKey,  username, password, body, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getReporteAsync(String xApiKey, String username, String password, Peticion body, final ApiCallback<Respuesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getReporteValidateBeforeCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public okhttp3.Call getReporteFolioCall(String xApiKey , String username, String password, PeticionFolio body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/folio";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReporteFolioValidateBeforeCall(String xApiKey, String username, String password, PeticionFolio body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getReporteFolio(Async)");
        }
      
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getReporteFolio(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getReporteFolio(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getReporteFolio(Async)");
        }
        
        okhttp3.Call call = getReporteFolioCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta getReporteFolio(String xApiKey,  String username, String password, PeticionFolio body) throws ApiException {
        ApiResponse<Respuesta> resp = getReporteFolioWithHttpInfo(xApiKey,  username, password, body);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> getReporteFolioWithHttpInfo(String xApiKey, String username, String password, PeticionFolio body) throws ApiException {
        okhttp3.Call call = getReporteFolioValidateBeforeCall(xApiKey,  username, password, body, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getReporteFolioAsync(String xApiKey,  String username, String password, PeticionFolio body, final ApiCallback<Respuesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getReporteFolioValidateBeforeCall(xApiKey,  username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
